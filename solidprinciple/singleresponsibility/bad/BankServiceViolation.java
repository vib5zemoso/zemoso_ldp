package solidprinciple.singleresponsibility.bad;

import java.util.Random;

public class BankServiceViolation {
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
    public String sendOTP(String medium) {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        if (medium.equals("email")) {
            System.out.println("Sending notification via email");
            return String.format("%06d", number);
        }
        if(medium.equals("mobile")){
            System.out.println("Sending notification to mobile");
            return String.format("%06d", number);
        }
        return "no OTP sent";
    }
    public void getLoanInterestInfo(String loanType) {
        if (loanType.equals("homeLoan")) {
            System.out.println("HomeLoan 7%");
        }
        if (loanType.equals("personalLoan")) {
            System.out.println("personalLoan 10%");
        }
        if (loanType.equals("car")) {
            System.out.println("carLoan 8%");
        }
    }
    public void printPassbook() {
        System.out.println("Printing Passbook");
    }
}
