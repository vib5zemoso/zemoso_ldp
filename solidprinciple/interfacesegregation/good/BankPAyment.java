package solidprinciple.interfacesegregation.good;

import solidprinciple.interfacesegregation.good.Bank;

import java.util.List;

public class BankPAyment implements Bank {

    @Override
    public void initiatePayments() {

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
