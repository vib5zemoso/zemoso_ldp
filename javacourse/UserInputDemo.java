package javacourse;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args){
        //Taking input
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter a decimal number: ");
        double number = input.nextDouble();
        System.out.println("Your number is: " + number);
        */
        int number =0;
        do{
            System.out.println("Enter a number");
            number =sc.nextInt();

        }while(number != 9);
        System.out.println("You got 9");
    }
}
