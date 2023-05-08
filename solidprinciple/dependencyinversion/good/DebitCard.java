package solidprinciple.dependencyinversion.good;

import solidprinciple.dependencyinversion.good.BankCard;

public class DebitCard implements BankCard {
    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}
