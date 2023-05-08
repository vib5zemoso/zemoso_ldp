package solidprinciple.openclose.bad;

public class SavingsAccounts{
    private double amount = 0;
    protected void deposit(double amnt) {
        this.amount = amnt;
    }

    protected void withdraw(double amnt) {
        if(amnt <= amount){
            amount -= amnt;
            System.out.println("Withdrawing " + amnt);
        }else{
            System.out.println("Enter less amount, insufficient balance");
        }
    }
}
