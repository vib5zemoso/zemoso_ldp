package javacourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsHandling {
//    public static void main(String[] args) throws FileNotFoundException {   METHOD-1
//        File file =new File("example.txt");
//        Scanner sc= new Scanner(file);
//    }

//    public static void main(String[] args) {  //METHOD - 2
//        File file =new File("C:\\Users\\yashp\\IdeaProjects\\oop\\src\\javacourse\\example.txt");
//        try {
//            Scanner sc= new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
public static void main(String[] args) {
    try {
        read();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

    public static void read() throws FileNotFoundException {
        File file =new File("C:\\Users\\yashp\\IdeaProjects\\oop\\src\\javacourse\\example.txt");
       Scanner sc= new Scanner(file);
    }
}
