package javacourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {

        try {
            read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found"); // Make this message more specific
        }

    }
    public static void read() throws FileNotFoundException {

        File file = new File("C:\\Users\\yashp\\IdeaProjects\\oop\\src\\javacourse\\example.txt");

        Scanner readFile = new Scanner(file);
        while (readFile.hasNextLine()) {

            String line = readFile.nextLine();

            System.out.println(line);

        }

        readFile.close();

    }
}
