package javacourse.InnerClass;

public class Application {
    public static void main(String[] args) {

        Machine machine = new Machine(12);

        machine.run();

        Machine.Tire tire = new Machine.Tire();
        tire.repair();

    }

}
