

package com.mycompany.loginu;

import java.util.ArrayList;

public class LoginU {

    public static ArrayList<User> user = new ArrayList(); 
    public static ArrayList<Book> books = new ArrayList();
    
    public static void main(String[] args) {
   
        User du = new User();
         
        du.usr = "admin";
        du.name = "Osmar";
        du.password = "admin";
        du.role = 1;
        
       LoginU.user.add(du);
        
    toLogin sign = new toLogin();
    sign.setVisible(true);
    
    
    }
}
