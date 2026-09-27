
public class Main {

    public static void main(String[] args) {
        
        Student sv1 = new Student("Lan", 8, 7.5, 9);

        Student sv2 = new Student("Nam", 7, 8, 8.5);

        Student sv3 = new Student("Hung", 9, 8, 7.5);


        sv1.capNhatEmail("lan@ptit.edu.vn")
           .capNhatSdt("0912345678");

        sv2.capNhatEmail("nam@ptit.edu.vn")
           .capNhatSdt("0987654321");

        sv3.capNhatEmail("hung@ptit.edu.vn")
           .capNhatSdt("0901234567");


        System.out.println("Sinh vien 1:");
        System.out.println("MSSV: " + sv1.getMssv());
        System.out.println("Ho ten: " + sv1.getName());

        System.out.println();

        System.out.println("Sinh vien 2:");
        System.out.println("MSSV: " + sv2.getMssv());
        System.out.println("Ho ten: " + sv2.getName());

        System.out.println();

        System.out.println("Sinh vien 3:");
        System.out.println("MSSV: " + sv3.getMssv());
        System.out.println("Ho ten: " + sv3.getName());

        System.out.println();


        System.out.println("Thong tin lien he cua Lan:");
        System.out.println("Email: " + sv1.getEmail());
        System.out.println("SDT: " + sv1.getSdt());

        System.out.println();

        System.out.println(
            "Tong so sinh vien: " + Student.getTotalStudents()
        );
    }
}