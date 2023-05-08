package javacourse.MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application {
    public static void main(String[] args){
        MultipleException me = new MultipleException();

//        try {
//            me.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

//        try {
//            me.start();
//        } catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }

        try {
            me.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {      //always handel child exception before the parent exception
            me.example();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
