
package com.mycompany.loginu;

public class BookList {
    
    
      public static void loadBooks() {
        Book b1 = new Book();
        b1.setAuthor("George Orwell");
        b1.setTitle("1984");
        b1.setPrice(9.99);
        b1.setStyle("Dystopian");

        Book b2 = new Book();
        b2.setAuthor("J.K. Rowling");
        b2.setTitle("Harry Potter");
        b2.setPrice(12.50);
        b2.setStyle("Fantasy");

        Book b3 = new Book();
        b3.setAuthor("Gabriel García Márquez");
        b3.setTitle("One Hundred Years of Solitude");
        b3.setPrice(14.00);
        b3.setStyle("Magical Realism");

        LogU.books.add(b1);
        LogU.books.add(b2);
        LogU.books.add(b3);
    }
       

      
    
}
