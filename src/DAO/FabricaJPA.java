/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author qwerty
 */
public class FabricaJPA {
    private static EntityManagerFactory fabrica = null;
    private static final String persistencia = "Prova1-SauloPU";
    
    private FabricaJPA(){
        fabrica = Persistence.createEntityManagerFactory(persistencia);
    }
    
    public static EntityManager getManager(){
        try {
            if (fabrica == null) {
                FabricaJPA cnxAberta = new FabricaJPA();
                System.out.println("Conexão Aberta");
            }
            return fabrica.createEntityManager();
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão: "+e.getMessage());
            return null;
        }
    }
    
    public static void fechaFabrica(){
        fabrica.close();
    }
}
