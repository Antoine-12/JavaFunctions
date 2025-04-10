
package com.mycompany.loginu;

public class DefaultData {
    
    public static void books(){
        Book bk = new Book();
        bk.setTitleP("The little prince");
        bk.setAuthor("Antoine Griezman");
        bk.setPrice(98.50);
        bk.setAmount(90);
        bk.setCategory("Fantacy");
        
        LoginU.books.add(bk);
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
