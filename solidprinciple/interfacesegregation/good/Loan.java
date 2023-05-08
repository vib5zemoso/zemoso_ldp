package solidprinciple.interfacesegregation.good;

public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}
