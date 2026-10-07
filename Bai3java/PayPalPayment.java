public class PayPalPayment implements PaymentMethod {

    @Override
    public String getPaymentType() {
        return "Không dùng tiền mặt";
    }

    @Override
    public String getPaymentName() {
        return "PayPal";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua PayPal.");
    }
}