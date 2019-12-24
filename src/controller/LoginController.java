/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.LoginFrame;

/**
 *
 * @author Dede Aminudin
 */
public class LoginController {
    
    LoginFrame L;
    
    public LoginController() {
        L = new LoginFrame();
    }
    
    public void start() {
        L.setVisible(true);
    }
    
    
    
}
