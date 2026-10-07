public class OfficeEmployee implements EmailSender {

    private String name;

    public OfficeEmployee(String name) {
        this.name = name;
    }

    public void sendEmail() {
        System.out.println(name + " đang gửi email.");
    }
}