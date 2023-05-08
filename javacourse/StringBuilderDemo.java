package javacourse;

public class StringBuilderDemo {
    public static void main(String[] args) {

        String example1 = "Hello! ";
        example1 += "My name ";
        example1 += "is David.";

        System.out.println(example1);

        StringBuilder example2 = new StringBuilder();

        example2.append("Hello! ");
        example2.append("My name ");
        example2.append("is Mike.");

        String text = example2.toString();
        System.out.println(text);

        String name = "Tom.";
        StringBuilder example3 = new StringBuilder("Hello! ");
        example3.append("My name ").append("is ").append(name);

        System.out.println(example3);
    }
}
