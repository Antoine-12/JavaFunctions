
package com.mycompany.loginu;

public class DefaultData {
    
    public static void users(){
        User us = new User();
        us.setUsr("ODA");
        us.setName("Osmar");
        us.setPassword("Ab1234");
        us.setRole(2);
        
        User us1 = new User();
        us1.setUsr("A0");
        us1.setName("Antonio");
        us1.setPassword("Ab1234");
        us1.setRole(2);
        
        User us2 = new User();
        us2.setUsr("A1");
        us2.setName("Didier");
        us2.setPassword("Ab1234");
        us2.setRole(2);
        
        User us3 = new User();
        us3.setUsr("A2");
        us3.setName("Lozano");
        us3.setPassword("Ab1234");
        us3.setRole(2);
        
        LoginU.user.add(us);
        LoginU.user.add(us1);
        LoginU.user.add(us2);
        LoginU.user.add(us3);
    }
    
    public static void books(){
        Book bk = new Book();
        bk.setTitleP("The little prince");
        bk.setAuthor("Antoine Griezman");
        bk.setPrice(98.50);
        bk.setAmount(90);
        bk.setCategory("Fantacy");

        Book bk1 = new Book();
        bk1.setTitleP("The Journey");
        bk1.setAuthor("MOssa");
        bk1.setPrice(80.32);
        bk1.setAmount(20);
        bk1.setCategory("Theory");
        
        Book bk2 = new Book();
        bk2.setTitleP("Positive Thinking");
        bk2.setAuthor("Norman Vicent");
        bk2.setPrice(60.56);
        bk2.setAmount(300);
        bk2.setCategory("self-help");
        
        LoginU.books.add(bk);
        LoginU.books.add(bk1);
        LoginU.books.add(bk2);
    }
    
    public static void pCodes(){
        PromotionalCode pc = new PromotionalCode();
        pc.setpCode("ABC123");
        pc.setValue(78);
        pc.setDiscount("Credit");
        pc.setDate("30/08/2025");
        
        PromotionalCode pc1 = new PromotionalCode();
        pc1.setpCode("YEAR");
        pc1.setValue(50);
        pc1.setDiscount("Percentage");
        pc1.setDate("15/10/2025");
        
        
        
        LoginU.Poc.add(pc1);
        LoginU.Poc.add(pc);
        
    }
}
