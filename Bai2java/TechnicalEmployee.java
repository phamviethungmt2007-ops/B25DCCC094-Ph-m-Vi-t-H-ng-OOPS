public class TechnicalEmployee implements Programmer, EmailSender {

    private String name;

    public TechnicalEmployee(String name) {
        this.name = name;
    }

    public void program() {
        System.out.println(name + " đang lập trình.");
    }

    public void sendEmail() {
        System.out.println(name + " đang gửi email.");
    }
}