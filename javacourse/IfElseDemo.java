package javacourse;

public class IfElseDemo {
    public static void main(String[] args){

        int amount = 0;

        while(true){

            if(amount == 6) {
                break;
            }else if(amount < 6){
                System.out.println("currently less than 6");
            }
            else{
                System.out.println("currently greater than 6, never breaking");
            }
            amount++;

        }
    }
}
