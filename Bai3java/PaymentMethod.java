public interface PaymentMethod {

    String getPaymentType();

    String getPaymentName();

    void pay(double amount);
}