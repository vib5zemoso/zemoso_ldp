package basic.java;
class A{

}
//child
class B extends A{

}
//multilevel
class C extends B{

}
//multiple
interface AA{
    default void method(){
        System.out.println("Method of AA");
    }
}
interface AAA {
    default void method(){
        System.out.println("Method of AAA");
    }
}
class BB extends A implements AA,AAA{

    @Override
    public void method() {
        AAA.super.method();
    }
}
//hierarchical A -> A, BB single parent, many child

//hybrid, not allowed in java because it results in multiple inheritance
//cyclic, not available as it is not required
public class InheritenceDemo {
    public static void main(String[] args){

    }
}
