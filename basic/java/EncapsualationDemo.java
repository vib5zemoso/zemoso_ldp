package basic.java;

class Account{
    private double balance;
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
}

public class EncapsualationDemo {
    public static void main(String[] args){
        Account acc= new Account();
        acc.setBalance(456.5);
        System.out.println(acc.getBalance());
    }
}
