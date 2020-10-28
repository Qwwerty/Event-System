/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FACADE;

import CONTROLLER.ControllerBase;
import MODEL.User;

/**
 *
 * @author qwerty
 */
public class facadeUser {
    
    private ControllerBase c;
    
    public Boolean faCreateUser (String u) {
   
        c.inserirGenerico(u);
        return false;
    }
    
}
