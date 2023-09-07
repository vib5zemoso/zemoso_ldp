package assignmentsjava.Assignment5.vibhuti.assignment.main;

import assignmentsjava.Assignment5.vibhuti.assignment.data.App1;
import assignmentsjava.Assignment5.vibhuti.assignment.singleton.App2;

public class Main {
    public static void main(String[] args) {
        App1 app1 = new App1();
        //global variables which can get default values.
        app1.display();
        //local variables which are not initialized but does not get any default values.
       // app1.show();
        //static methods can only access static variables.
        App2 app2 = new App2("Str");
        app2.Process("Str");
        app2.print();

    }
}
