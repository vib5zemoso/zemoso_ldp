package solidprinciple.interfacesegregation.bad;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();
    void initiateLoanSettlement();
    void initiateRePayment();
}
