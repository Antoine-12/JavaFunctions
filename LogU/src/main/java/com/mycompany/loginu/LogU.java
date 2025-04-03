

package com.mycompany.loginu;

import java.util.ArrayList;

public class LogU {
    
    public static ArrayList<User> users = new ArrayList();
    public static ArrayList<Book> books = new ArrayList();
    public static ArrayList<PromoCode> prco = new ArrayList();

    public static void main(String[] args) {
        
        User us = new User();
        
        us.setName("osmar");
        us.setPassword("admin");
        us.setRole(1);
        us.setUser("admin");
        
        LogU.users.add(us);
        
        BookList.loadBooks();
        
        
        toLogin lg = new toLogin();
        lg.setVisible(true);
        // todos los atributos de una clase deben ser privados 
        // encapsular: la variables privadas y se generan mitalos de set and set 
    }
}
