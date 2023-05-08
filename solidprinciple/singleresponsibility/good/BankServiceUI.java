package solidprinciple.singleresponsibility.good;

import solidprinciple.singleresponsibility.good.BankService;

public class BankServiceUI {
    public static void main(String[] args){
        BankService bs= new BankService();
        bs.deposit(5000);
        bs.withDraw(6000);
        bs.withDraw(2000);
    }
}
