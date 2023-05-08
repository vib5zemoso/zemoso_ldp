package oopPractise;

class Fan{
    private boolean isOn;
    public static int statsvar;

    Fan(boolean a){
        this.isOn =a;
    }

    public void turnOn(){
        isOn=true;
        System.out.println("Fan is on");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("Fan is off");
    }
}

class addition{

    private static int val = 0;

    public int add(int a, int b){
        int sum=0;
        sum = a+b;
        return sum;
    }
    public static int get(){
        return val;
    }
}

public class basic1 {
    public static void main(String[] args){
        Fan myFan = new Fan(true);
        myFan.turnOff();
        myFan.turnOn();

        Fan yourFan = new Fan(false);
        Fan.statsvar =4;

        addition addtwo = new addition();
        System.out.println(addtwo.add(5,7));

        int getval = addition.get();
        System.out.println(getval);

    }
}
