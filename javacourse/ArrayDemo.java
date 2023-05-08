package javacourse;

public class ArrayDemo {
    public static void main(String[] args) {

        int number = 10;

        int[] numbers = new int[5]; //reference type
        int[] num = {5,4,3,7,56};
        System.out.println(numbers[0]);

        numbers[0] = 15;
        numbers[1] = 20;
        numbers[2] = 25;
        numbers[3] = 30;
        numbers[4] = 35;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        for(int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
