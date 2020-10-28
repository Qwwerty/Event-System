/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.FabricaJPA;
import MODEL.Event;
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
public class ControllerEvents extends ControllerBase<Event>{

    public ControllerEvents () {
        obj = new Event();
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
            File f = new File("event.txt");
            FileWriter fw;
            Gson g = new Gson();

            fw = new FileWriter("event.txt");

            PrintWriter gravarArq = new PrintWriter(fw);

            List<Event[]> event = FabricaJPA.getManager().createNamedQuery("Event.All").getResultList();

            for (int i = 0; i < event.size(); i++) {
                String JSON = g.toJson(event.get(i));
                gravarArq.print(JSON);
            }

            fw.close();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred, check the imported file and try again.", "Error", JOptionPane.ERROR_MESSAGE);        
        }
        return false;
    }
    
}
