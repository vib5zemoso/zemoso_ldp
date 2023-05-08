package solidprinciple.dependencyinversion.good;

import solidprinciple.dependencyinversion.good.BankCard;

public class CreditCard implements BankCard {
    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}
