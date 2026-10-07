public class Main {
    public static void main(String[] args) {

        OfficeEmployee office = new OfficeEmployee("An");
        TechnicalEmployee technical = new TechnicalEmployee("Bình");
        SalesEmployee sales = new SalesEmployee("Chi");

        System.out.println(" Nhân viên văn phòng ");
        office.sendEmail();

        System.out.println("\n Nhân viên kỹ thuật ");
        technical.program();
        technical.sendEmail();

        System.out.println("\n Nhân viên bán hàng ");
        sales.sell();
        sales.sendEmail();
    }
}