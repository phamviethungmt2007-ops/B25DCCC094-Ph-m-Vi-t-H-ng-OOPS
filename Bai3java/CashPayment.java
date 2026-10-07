public class CashPayment implements PaymentMethod {

    @Override
    public String getPaymentType() {
        return "Trực tiếp";
    }

    @Override
    public String getPaymentName() {
        return "Tiền mặt";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng tiền mặt.");
    }
}