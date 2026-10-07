public class SalesEmployee implements Salesperson, EmailSender {

    private String name;

    public SalesEmployee(String name) {
        this.name = name;
    }

    public void sell() {
        System.out.println(name + " đang bán hàng.");
    }

    public void sendEmail() {
        System.out.println(name + " đang gửi email.");
    }
}