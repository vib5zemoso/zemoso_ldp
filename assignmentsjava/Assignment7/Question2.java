package assignmentsjava.Assignment7;

abstract class Cycle{
    public void balance(){};
}
class Unicycle extends Cycle{
    @Override
    public void balance() {
        System.out.println("Very difficult to balance");
    }
}
class Bicycle extends Cycle{
    @Override
    public void balance() {
        System.out.println("Easy to balance with some practise");
    }
}
class Tricycle extends Cycle{

}

public class Question2 {
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];
        obj[0] = new Unicycle();
        obj[0].balance();
        obj[1] = new Bicycle();
        obj[1].balance();
        obj[2] = new Tricycle();
        obj[2].balance();
    }
}
