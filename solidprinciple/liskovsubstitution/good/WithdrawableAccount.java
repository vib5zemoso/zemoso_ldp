package solidprinciple.liskovsubstitution.good;

public abstract class WithdrawableAccount extends Account {

    protected abstract void withdraw(double amount);
}
