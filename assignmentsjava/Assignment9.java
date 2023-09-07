package assignmentsjava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public void checkString(String str){
        String regex = "[A-Z].*[.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches()){
            System.out.println("Valid String");
        }else{
            System.out.println("invalid String");
        }
    }

    public static void main(String[] args){
        Assignment9 obj = new Assignment9();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        obj.checkString(s);
    }
}
