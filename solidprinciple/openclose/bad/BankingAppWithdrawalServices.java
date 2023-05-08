package solidprinciple.openclose.bad;

public class BankingAppWithdrawalServices {
    private CurrentAccounts accountType1;
    private SavingsAccounts accountType2;

    public BankingAppWithdrawalServices(CurrentAccounts accountType1) {
        this.accountType1 = accountType1;
    }

    public void withdraw(double amount) {
        accountType1.withdraw(amount);
    }
}
