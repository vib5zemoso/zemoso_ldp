package assignment.solidprinciple.SRP.good;

public class Printer {
    public void print(Printable printable) {
        System.out.println(printable.getContent());
    }
}
