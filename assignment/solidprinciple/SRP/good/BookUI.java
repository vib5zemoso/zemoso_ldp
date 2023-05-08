package assignment.solidprinciple.SRP.good;

import java.security.PublicKey;

public class BookUI {
    public static void main(String[] args){
        Book useBook = new Book();
        useBook.setText("This is the text using printer");

        System.out.println(useBook.getContent());
    }
}
