package solidprinciple.interfacesegregation.good;

public interface Bank extends Payment {
    void initiatePayments();
}
