package basic.java;
class bankAcc{
    private double balance = 10000;
    private String username = "basicstr";
    private String password = "password";

    public double getbal(String usern,  String Pass){
        if(usern.equals(username) && password.equals(Pass)){
            return balance;
        }else{
            return 0.0;
        }
    }
}
public class dataHiding {
    public static void main(String[] args){
        bankAcc acc = new bankAcc();

        System.out.println(acc.getbal("basicstr","password"));
    }
}



