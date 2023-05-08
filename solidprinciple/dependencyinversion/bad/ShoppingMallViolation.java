package solidprinciple.dependencyinversion.bad;

import solidprinciple.dependencyinversion.good.CreditCard;
import solidprinciple.dependencyinversion.good.ShoppingMall;

public class ShoppingMallViolation { //tight coupling with credit card class
    private CreditCard creditCard;

    public ShoppingMallViolation(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void doPurchaseSomething(long amount){
        creditCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(creditCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
