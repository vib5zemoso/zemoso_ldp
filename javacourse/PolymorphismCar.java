package javacourse;

public class PolymorphismCar extends PolymorphismVehicle {
    @Override
    public void design() {
        System.out.println("Car design");
    }
    public void ride() {

        System.out.println("Riding the car");
    }
}
