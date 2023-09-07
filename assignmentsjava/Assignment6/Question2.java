package assignmentsjava.Assignment6;

public class Question2 {
    Question2() {
        System.out.println("constructor 1 is running. ");
    }
    Question2(int str) {
        this();
        System.out.println(str);
    }
    public static void main(String[] args) {
        Question2 obj = new Question2(92);
    }
}
