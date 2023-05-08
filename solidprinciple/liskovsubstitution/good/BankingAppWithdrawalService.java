package solidprinciple.liskovsubstitution.good;

public class BankingAppWithdrawalService {
    private WithdrawableAccount withdrawableAccount;

    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    public void withdraw(double amount) {
        withdrawableAccount.withdraw(amount);
    }
}
