package javacourse;
class Program {

    int value;
    String text;

    public Program() {
        this(5); //call to second constructor, it must be the first statement
                       //so you cannot call two constructor
        System.out.println("First Constructor");
        value = 12;
    }

    public Program(int value) {
        this.value = value;
        System.out.println("Second Constructor");
    }

    public Program(int value, String text) {
        this();  //call to first constructor
        this.value = value;
        this.text = text;

        System.out.println("Third Constructor");

    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Program myProgram = new Program();
        Program myProgram1 = new Program(2);
        Program myProgram2 = new Program(5, "Hi");
    }
}
