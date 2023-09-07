package assignmentsjava.Assignment7;

import java.util.Scanner;

interface A{
    public void getA();
    public void setA();
}
interface B{
    public void getB();
    public void setB();
}
interface C{
    public void getC();
    public void setC();
}
interface D extends A,B,C{
    public void getD();
}
class Implementation implements D{

    @Override
    public void getA() {
        System.out.println("interface A get method");
    }

    @Override
    public void setA() {
        System.out.println("interface A set method");
    }

    @Override
    public void getB() {
        System.out.println("interface B get method");
    }

    @Override
    public void setB() {
        System.out.println("interface B set method");
    }

    @Override
    public void getC() {
        System.out.println("interface C get method");
    }

    @Override
    public void setC() {
        System.out.println("interface C set method");
    }

    @Override
    public void getD() {
        System.out.println("interface D get method");
    }
}
class Question3 {

    static void method1(A i) {
    };
    static void method2(B i) {
    };
    static void method3(C i) {
    };
    static void method4(D i) {
    };

    public static void main(String[] args){
        Implementation imp = new Implementation();
        String st;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the interface");
        st = in.nextLine();
    }

}
