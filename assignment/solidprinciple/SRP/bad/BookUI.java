package assignment.solidprinciple.SRP.bad;

public class BookUI {
    public static void main(String[] args){
        Book opbook = new Book();
        opbook.setAuthor("james");
        System.out.println(opbook.getAuthor());
    }
}
