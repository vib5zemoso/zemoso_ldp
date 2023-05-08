package javacourse;

public class TernaryOperator {
    public static void main(String[] args) {

        System.out.println(true ? "true": "false");

        int number = 100;

        number = number > 20 ? number: 20;

        System.out.println(number);

        int[] numbers = {5,43,75,57,84};
        int lowestNumber = Integer.MAX_VALUE;
        for(int currentNumber: numbers) {
            lowestNumber = currentNumber < lowestNumber ? currentNumber : lowestNumber;
        }
        System.out.println(lowestNumber);
    }
}
