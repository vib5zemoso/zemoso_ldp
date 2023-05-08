package solidprinciple.singleresponsibility.good;

public class BankService {
    private int amount = 0;

    public void deposit(int amo) {
        this.amount = amo;
    }

    public void withDraw(int amo) {
        if(amo <= amount){
            amount -= amo;
            System.out.println("Withdrawing " + amo);
        }else{
            System.out.println("Enter less amount");
        }

    }
}
// It states that "A module should be responsible to one, and only one,
// actor." The term actor refers to a group (consisting of one or more
// stakeholders or users) that requires a change in the module.