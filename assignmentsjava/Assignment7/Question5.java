package assignmentsjava.Assignment7;

class Outer1{
    class Inner1{
        Inner1(int a){
            System.out.println("Value of A in Inner1 is "  +a);
        }
    }
}
class Outer2 extends Outer1{
    class Inner2{
        Inner2(int a){
            System.out.println("Value of A in Inner2 is "  +a);
        }
    }
}
public class Question5 {
    public static void main(String[] args){
        Outer2.Inner2 in = new Outer2().new Inner2(7);

    }
}

