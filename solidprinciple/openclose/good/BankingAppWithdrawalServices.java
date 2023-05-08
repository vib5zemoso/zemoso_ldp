package solidprinciple.openclose.good;

import solidprinciple.openclose.good.BankAccount;

public class BankingAppWithdrawalServices {
    private BankAccount account;

    public BankingAppWithdrawalServices(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
