package solidprinciple.interfacesegregation.bad;

import java.util.List;

public class LoanPayment implements Payment{
    @Override
    public void initiatePayments() { //not needed
        throw new UnsupportedOperationException("This is not a bank payment");
    }

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }

    @Override
    public void initiateLoanSettlement() {

    }

    @Override
    public void initiateRePayment() {

    }
}
