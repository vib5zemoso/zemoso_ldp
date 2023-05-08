package javacourse;
class Method{

    String animal;
    int value;
    int month;

    void run() {
        System.out.println("Running");
        for(int i=0; i<4; i++) {
            System.out.println("My " + animal + " is " + value + " years old.");
        }
    }

    int calculateMonthsToBirthday() {
        int monthsLeft = 12 - month;
        return monthsLeft;
    }

    void talk(String text) {
        System.out.println(text);
    }

    void walk(int speed) {
        System.out.println("Walking " + speed + " km per hour");
    }

    void timer(int minutes, double seconds) {

        System.out.println("It took " + minutes + "m and " + seconds + "s to get down the hill.");
    }
}

public class ReturnTypeMethodDemo {
    public static void main(String[] args) {

        Method name = new Method();
        name.animal = "Cat";
        name.value = 9;
        // name.run();
        name.month = 8;
        int months = name.calculateMonthsToBirthday();
        name.walk(7);
        name.talk("Hi, I am Steven!");
        String hello = "Hello there!";
        name.talk(hello);
        name.timer(9, 3.65);

        System.out.println("Months until birthday " + months);
    }
}
