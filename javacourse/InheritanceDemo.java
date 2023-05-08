package javacourse;

public class InheritanceDemo {
    public static void main(String[] args) {

        // access modifiers: public, protected, default(lack of access modifier), private.

        Factory factory1 = new Factory();

        factory1.design();
        factory1.build();

        Car car1 = new Car();

        car1.design();
        car1.build();
        car1.brand();

    }
}
