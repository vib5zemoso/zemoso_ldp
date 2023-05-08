package javacourse.InnerClass;

public class Machine {
    private int id;

    class AI{
        public void activate(){
            System.out.println("machine "+ id + " is activated");
        }
    }

    static class Tire{
        public void repair(){
            System.out.println("Tire is repaired");
        }
    }

    public Machine(int id){
        this.id = id;
    }
    public void run(){
        System.out.println("Runtime "+ id);
        AI ai =new AI();
        ai.activate();
        final String type ="electric";

        class Test{
            public void example(){
                System.out.println("ID is "+id);
                System.out.println("Type is "+type);
            }
        }

        Test test = new Test();
        test.example();
    }
}
