
package com.mycompany.loginu;

import javax.swing.JTextField;


public class ToolBox {
    
    public static void cleanjtxt(JTextField... fields){
        for(JTextField field : fields){
            field.setText("");
        }
    }
    
}
