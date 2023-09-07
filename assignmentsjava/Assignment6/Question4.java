package assignmentsjava.Assignment6;

class Question3 {
    Question3(String str) {
        System.out.println(str);
    }

};
public class Question4 {

    public static void main(String[] args) {
        Question3[] obj=new Question3[2];
        obj[0]=new Question3("Hi");
        obj[1]=new Question3("Hello");
    }
}
