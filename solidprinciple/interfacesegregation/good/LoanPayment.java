package solidprinciple.interfacesegregation.good;

import solidprinciple.interfacesegregation.good.Loan;

import java.util.List;

public class LoanPayment implements Loan {

    @Override
    public void initiateLoanSettlement() {
        // ...
    }

    @Override
    public void initiateRePayment() {
        // ...
    }

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }
}
