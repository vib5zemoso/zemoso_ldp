package javacourse;

public class PolymorphismApp {
    public static void main(String[] args){
        PolymorphismVehicle vehicle = new PolymorphismVehicle();
        PolymorphismCar car = new PolymorphismCar();

        PolymorphismVehicle vehicle2 = car;
        vehicle2.design();

        car.ride();
        createDesign(car);
    }
    public static void createDesign(PolymorphismVehicle vehicle) {

        vehicle.design();
    }
}
