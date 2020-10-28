/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.FabricaJPA;
import MODEL.User;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class ControllerUser extends ControllerBase<User> {

    public ControllerUser() {
        obj = new User();
        super.pegarClass();
    }

    ;
    
    public Boolean logar(String u) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        User tempUser = (User) this.obj.toObjeto(u);

        List<Object[]> user = FabricaJPA.getManager().createNamedQuery("User.Find")
                .setParameter("password", tempUser.getUsername())
                .getResultList();

        String username = (String) user.get(0)[0];
        String password = (String) user.get(0)[1];

        if (username.equals(tempUser.getUsername()) && password.equals(tempUser.getPassword())) {
            return true;
        }
        return false;
    }

    public Boolean Import(String JSON) {
        String pattern = "\\{.*\\}";
        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile(pattern).matcher(JSON);

        while (m.find()) {
            allMatches.add(m.group());
        }

        if (allMatches.size() > 0) {
            try {
                Gson g = new Gson();
                for (int i = 0; i < allMatches.size(); i++) {
                    String newJSON = allMatches.get(i);
                    this.inserirGenerico(newJSON);
                }
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

        return false;
    }

    public Boolean Export() throws IOException {

        try {
            File f = new File("user.txt");
            FileWriter fw;
            Gson g = new Gson();

            fw = new FileWriter("user.txt");

            PrintWriter gravarArq = new PrintWriter(fw);

            List<User[]> user = FabricaJPA.getManager().createNamedQuery("User.All").getResultList();

            for (int i = 0; i < user.size(); i++) {
                String JSON = g.toJson(user.get(i));
                gravarArq.print(JSON);
            }

            fw.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred, check the imported file and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public String searchName(String u) {
        User tempUser = (User) this.obj.toObjeto(u);

        List<Object[]> user = FabricaJPA.getManager().createNamedQuery("User.Find")
                .setParameter("password", tempUser.getUsername())
                .getResultList();
    
        String username = (String) user.get(0)[0];
        String password = (String) user.get(0)[1];
        String type = (String) user.get(0)[2];
        
        tempUser.setUsername(username);
        tempUser.setType(type);
        
        String JSON = tempUser.toStringVetor();
        
        return JSON;
    }
}
