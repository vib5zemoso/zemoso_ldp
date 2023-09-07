package assignmentsjava.Assignment11;
import java.util.HashMap;
import java.io.*;

class FileReadWrite {
    HashMap<Character, Integer> Map=new HashMap<Character, Integer>();

    public void charCount(){
        try {
            FileReader fread=new FileReader("C:\\Users\\yashp\\IdeaProjects\\oop\\src\\assignmentsjava\\Assignment11\\count.txt");

            int index;
            while((index=fread.read())!=-1) {
                if(!Character.isWhitespace((char)index)) {
                    if(Map.containsKey((char)index)) {
                        Map.put((char)index, Map.get((char)index)+1);
                    }
                    else {
                        Map.put((char)index, 1);
                    }
                }
            }
            writeData();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeData() {
        try {
            File file =new File("C:\\Users\\yashp\\IdeaProjects\\oop\\src\\assignmentsjava\\Assignment11\\output.txt");
            FileWriter fwrite=new FileWriter(file);
            fwrite.write(Map.toString());
            fwrite.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
};

public class MainClass {

    public static void main(String[] args) {
        FileReadWrite frw = new FileReadWrite();
        frw.charCount();

    }

}