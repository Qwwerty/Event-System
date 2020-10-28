/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import CONTROLLER.ControllerEvents;
import CONTROLLER.ControllerPeoples;
import CONTROLLER.ControllerUser;

/**
 *
 * @author qwerty
 */
public class Utils {
    
    public static String stringToJson(String[][] dados) {
        if(dados.length == 0) return "{}";
        
        String JSON = "{";
        int countRows = dados.length;
        
        for(int i = 0; i < countRows; i++) {
            if(i == (countRows - 1))
                JSON += (char)34 + dados[i][0] + (char) 34 + ":" + (char) 34 + dados[i][1] + (char) 34;
            else
                JSON += (char)34 + dados[i][0] + (char) 34 + ":" + (char) 34 + dados[i][1] + (char) 34 + ",";
        }
        
        return JSON+="}";
    }
    
    public static String[][] JsonToVector (String dados, String view) {
        
        if(dados.length() == 0) return null;
        
        String[][] text = null;
        
        if(view.equals("user"))
            text = new String[1][5];
        else if(view.equals("people"))
            text = new String[1][9];
        else if(view.equals("event"))
            text = new String[1][7];
        
        String withoutKeys = dados.replace("{", "").replace("}","");
        String[] splitKeys = withoutKeys.split(",");
        
        for(int i = 0; i < splitKeys.length; i++) {
            System.out.println(splitKeys[i]);
            String[] chaveKeY = splitKeys[i].split(":");
            int quantityString = chaveKeY[1].length() - 1;
            
            if(chaveKeY[1].contains(String.valueOf((char)34)))
                text[0][i] = chaveKeY[1].substring(1, quantityString);
            else {
                text[0][i] = String.valueOf(chaveKeY[1]);
            }
        }
        return text;
    } 
    
    public static Boolean Import (String JSON, int table) {
        
        if(table == 1) {
            ControllerUser controller = new ControllerUser();
            try {
                controller.Import(JSON);
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        else if(table == 2) {
            ControllerPeoples controller = new ControllerPeoples();
            try {
                controller.Import(JSON);
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        else if(table == 3) {
            System.out.println("entrou");
            ControllerEvents controller = new ControllerEvents();
            try {
                controller.Import(JSON);
                return true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
        
        return false;
    }

    
}
