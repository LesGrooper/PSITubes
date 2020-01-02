/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dede Aminudin
 */
public class Koneksi {
    
    public static java.sql.Connection getConnection(){
        return getConnection("jdbc:mysql://localhost/akademik","root","");
    }
    
    private static java.sql.Connection getConnection(String url, String user, String pass){
        java.sql.Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }   
        return con;
    }
    
    
    
    
    
}
