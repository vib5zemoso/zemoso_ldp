package solidprinciple.liskovsubstitution.good;

public class FixedTermDepositAccount extends Account {
    private double amount = 0;
    @Override
    protected void deposit(double amnt) {
        this.amount = amnt;
    }
}
