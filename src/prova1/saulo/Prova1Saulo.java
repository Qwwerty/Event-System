/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1.saulo;

import CONTROLLER.ControllerUser;
import UTIL.Utils;
import VIEW.Login;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

/**
 *
 * @author qwerty
 */
public class Prova1Saulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Prova1-SauloPU");
        EntityManager staff = factory.createEntityManager();
        
        JFrame Login = new Login();
        Login.setVisible(true);
        
//        //====== TESTES
//        String[][] JSON = new String[5][2];
//        
//        JSON[0][0] = "id";
//        JSON[0][1] = "0";
//        
//        JSON[1][0] = "username";
//        JSON[1][1] = "rhalf";
//        
//        JSON[2][0] = "name";
//        JSON[2][1] = "rhalf oliveira";
//        
//        JSON[3][0] = "type";
//        JSON[3][1] = "Administrador";
//        
//        JSON[4][0] = "password";
//        JSON[4][1] = "123";
//        
//        String retorno = Utils.stringToJson(JSON);
//        
//        ControllerUser controller = new ControllerUser();
//        controller.inserirGenerico(retorno);
//        
//        
//        //======================LOGAR=======================================
//        String[][] JSON2 = new String[2][2];
//        
//        JSON2[0][0] = "username";
//        JSON2[0][1] = "rhalf";
//        
//        JSON2[1][0] = "password";
//        JSON2[1][1] = "123";
//        
//        String retorno2 = Utils.stringToJson(JSON2);
//        
//        System.out.println(controller.logar(retorno2));
//          

    }
    
}
