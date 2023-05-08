package solidprinciple.singleresponsibility.good;

public class LoanService {
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
}
