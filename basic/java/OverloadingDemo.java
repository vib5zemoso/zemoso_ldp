package basic.java;

//method overloading(compile time polymorphism) it is called early binding.
//It considers method signature,i.e. method name + argument type
class Addition{
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void sum(double a, double b){
        System.out.println(a+b);
    }
}

public class OverloadingDemo {
    public static void main(String[] args){
        Addition add= new Addition();
        add.sum(2,3);
        add.sum(2,5,3);
        add.sum(10.5f, 34.5);
    }
}
//byte->short ->int ->long->float->double
//               /\
//                |
//              char