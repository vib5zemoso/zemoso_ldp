package solidprinciple.liskovsubstitution.bad;

public class CurrentAccount extends Account {
    private double amount = 0;
    @Override
    protected void deposit(double amnt) {
        this.amount = amnt;
    }
    @Override
    protected void withdraw(double amnt) {
        if(amnt <= amount){
            amount -= amnt;
            System.out.println("Withdrawing " + amnt);
        }else{
            System.out.println("Enter less amount, insufficient balance");
        }
    }
}
