package solidprinciple.liskovsubstitution.bad;

public class FixedTermDepositAccount extends Account {
    private double amount = 0;
    @Override
    protected void deposit(double amnt) {
        this.amount = amnt;
    }

    @Override
    protected void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }
}
