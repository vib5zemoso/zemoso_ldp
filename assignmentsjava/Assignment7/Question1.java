package assignmentsjava.Assignment7;
abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Rodent");
    }
    public abstract void furColor();
    public abstract void Weight();
}
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Constructor of Mouse");
    }
    @Override
    public void furColor() {
        System.out.println("Fur Color is black");
    }

    @Override
    public void Weight() {
        System.out.println("Average weight is 20g");
    }
}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Constructor of Gerbil");
    }
    @Override
    public void furColor() {
        System.out.println("Fur Color is brown");
    }

    @Override
    public void Weight() {
        System.out.println("Average weight is 58g");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Constructor of Hamster");
    }
    @Override
    public void furColor() {
        System.out.println("Fur Color is white");
    }

    @Override
    public void Weight() {
        System.out.println("Average weight is 85g");
    }
}

public class Question1 {
    public static void main(String[] args){
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].furColor();
        rodent[0].Weight();
        rodent[1] = new Gerbil();
        rodent[1].furColor();
        rodent[1].Weight();
        rodent[2] = new Hamster();
        rodent[2].furColor();
        rodent[2].Weight();
    }
}
