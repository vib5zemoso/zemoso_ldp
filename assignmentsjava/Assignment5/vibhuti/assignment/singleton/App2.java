package assignmentsjava.Assignment5.vibhuti.assignment.singleton;

public class App2 {
    String text;
    public App2(String newText){
        text = newText;
    }

    public static App2 Process(String str){
        //static methods can only access static variables;
        App2 app = new App2(str);
        return app;
    }
    public void print() {
        System.out.println(text);
    }

    public static void main(String[] args)
    {
        String str = "hello";
        App2 obj = new App2(str);
        obj.Process(str);
        obj.print();
    }


}
