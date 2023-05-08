package solidprinciple.openclose.good;

import solidprinciple.openclose.good.BankAccount;

public class SavingsAccounts implements BankAccount {
    private double totalAmount = 0;
    @Override
    public void deposit(double amount) {
        this.totalAmount = amount;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= totalAmount){
            totalAmount -= amount;
            System.out.println("Withdrawing " + amount);
        }else{
            System.out.println("Enter less amount, insufficient balance");
        }
    }
}
