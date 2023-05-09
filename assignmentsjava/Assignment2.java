package assignmentsjava;
import java.util.Scanner;
//TC - O(n)

public class Assignment2 {

    public static boolean checkString(String input) {
        return input.toLowerCase().replaceAll("[^a-z]", "").replaceAll("(.)(?=.*\\1)", "").length() == 26;
    }
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a string");
        String scInput = sc.nextLine();
        System.out.println(checkString(scInput));
    }
}

//abcdefghijklmnopqrstuvwxyz