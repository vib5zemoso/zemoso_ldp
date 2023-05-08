package solidprinciple.liskovsubstitution.bad;

public abstract class Account {
    protected abstract void deposit(double amount);

    protected abstract void withdraw(double amount);
}
