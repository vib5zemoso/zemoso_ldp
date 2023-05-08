package basic.java;

import java.util.ArrayList;

interface Mobile{
 public void calling(String number);
 public void sendMessgae(String message);
}
class Apple implements Mobile{

    private ArrayList<String> contacts = new ArrayList<>();

    public  void addContacts(String number){
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("calling... "+ number);
    }

    @Override
    public void sendMessgae(String message) {
        System.out.println("sending message... "+ message);
    }
}
public class abstractDemo {
    public static void main(String[] args){
        Apple myphone = new Apple();
        myphone.addContacts("1234567890");
        myphone.calling("1234561");
        myphone.sendMessgae("hey");


        Samsung newphone = new Samsung();
        newphone.addContacts("123");
        newphone.calling("123");
        newphone.sendmessage("hey samsung");
    }
}

abstract class Mobiles{
    private ArrayList<String> list = new ArrayList<>();

    abstract void calling(String num);
    abstract  void sendmessage(String mess);
    public void addContacts(String number){
        list.add(number);
    }
}

class Samsung extends Mobiles{

    @Override
    void calling(String num) {
        System.out.println("calling... "+ num);
    }

    @Override
    void sendmessage(String mess) {
        System.out.println("send message... "+ mess);
    }
}