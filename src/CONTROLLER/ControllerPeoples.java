/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.FabricaJPA;
import MODEL.People;
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
public class ControllerPeoples extends ControllerBase<People>{

    public ControllerPeoples () {
        obj = new People();
        super.pegarClass();
    };
    
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
            File f = new File("people.txt");
            FileWriter fw;
            Gson g = new Gson();

            fw = new FileWriter("people.txt");

            PrintWriter gravarArq = new PrintWriter(fw);

            List<People[]> user = FabricaJPA.getManager().createNamedQuery("People.All").getResultList();

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

    public Boolean validCPF(String JSON) {
        
       People tempPeople = (People) this.obj.toObjeto(JSON);

        Object people = FabricaJPA.getManager().createNamedQuery("People.ExistCPF")
                .setParameter("cpf", tempPeople.getCFP())
                .getSingleResult();
        
        System.out.println(people);
        
        if(people.toString().equals("0"))
            return true;
        else 
            return false;
    }
    
        public Boolean validRegistrationNumber(String JSON) {
        
       People tempPeople = (People) this.obj.toObjeto(JSON);

        Object people = FabricaJPA.getManager().createNamedQuery("People.ExistRegistrationNumber")
                .setParameter("number", tempPeople.getRegistrationNumber())
                .getSingleResult();
        
        System.out.println(people);
        
        if(people.toString().equals("0"))
            return true;
        else 
            return false;
    }

}

