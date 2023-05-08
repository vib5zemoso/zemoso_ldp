package basic.java;
//it allows child to modify method provided by parent class
//method overriding-> type of referred object determines which version of an overridden method will be executed.
//it is runtime polymorphism or late binding

//we cannot decrease the visibility to the overridden method
//we cannot override the final methods
//declare method as static to hide implementation from the derived class, we can override it as it is a new method not the method in parent class.
//cannot override the private methods

//we can call the base class implementation in the overriding method using super keyword.

class Vehicle{
    public void run(){
        System.out.println("veh is running");
    }
}
class Car extends Vehicle{
    public void run(){
        System.out.println("Car is running");
    }
}
public class Overriding {
    public static void main(String[] args){
        Vehicle veh = new Vehicle();
        veh.run();

        Car car = new Car();
        car.run();

        Vehicle vCar = new Car();
        vCar.run();

       // Car carv = new Vehicle();  child cannot hold the parent
    }
}
