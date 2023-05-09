package assignmentsjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment1 {
    private void findFiles()
    {
        // address of files or folder where to search
        File file = new File("C:\\Users\\yashp\\IdeaProjects\\oop\\src\\javacourse");
        String fileName;
        Scanner in = new Scanner(System.in);
        do{
            int flag =0;
            System.out.println("Enter the name file or folder. To Stop enter STOP");
            fileName =in.nextLine();

            String[] files = file.list();
            //continuous check each file or folder
            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean check = fileName.equals(string);

                if (check){
                    flag = 1;
                    System.out.println("File Found : " + string);
                    System.out.println("The Path is: "+ file.getAbsolutePath());
                }
            }
            //if file not found
            if(flag == 0 && !fileName.equals("STOP"))
            {
                System.out.println("File not find : Re-enter the name of the file.");
            }
        } while(!fileName.equals("STOP"));
    }

    public static void main(String[] args){
        Assignment1 obj =new Assignment1();
        obj.findFiles();
    }
}
