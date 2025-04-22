
package com.mycompany.loginu;

import javax.swing.JTextField;


public class ToolBox {
    
    public static void cleanjtxt(JTextField... fields){
        for(JTextField field : fields){
            field.setText("");
        }
    }
    
     public static boolean verPass(String password){
         
        boolean pUppercase = false;
        boolean pLowercase = false;
        boolean pNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                pUppercase = true;
            } else if (Character.isLowerCase(c)) {
                pLowercase = true;
            } else if (Character.isDigit(c)) {
                pNumber = true;
            }
        }

        return pUppercase && pLowercase && pNumber;
    
    }
    
}
