public class CreditCardPayment implements PaymentMethod {

    @Override
    public String getPaymentType() {
        return "Không dùng tiền mặt";
    }

    @Override
    public String getPaymentName() {
        return "Thẻ tín dụng";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng.");
    }
}