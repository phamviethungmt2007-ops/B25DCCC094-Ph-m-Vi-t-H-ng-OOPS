public class Main {

    public static void main(String[] args) {

        Student sv1 = new Student( 
                "B25DCCC001", "Hung", 8, 7.5, 9
        );

        Student sv2 = new Student(
                "B25DCCC002", "Nhung", 7, 8, 8.5
        );

        Student sv3 = new Student(
                "B25DCCC003", "Quân", 9, 6.5, 7
        );

        System.out.println("===== BAI 1 =====");

        System.out.println(
                sv1.getMssv() + " - "
                + sv1.getName() + " - Diem TB: "
                + sv1.diemTrungBinh()
        );

        System.out.println(
                sv2.getMssv() + " - "
                + sv2.getName() + " - Diem TB: "
                + sv2.diemTrungBinh()
        );

        System.out.println(
                sv3.getMssv() + " - "
                + sv3.getName() + " - Diem TB: "
                + sv3.diemTrungBinh()
        );

        // Kiem tra diem khong hop le
        sv1.setDiemGK(-1);
        sv1.setDiemGK(11);

        System.out.println(
                "Diem GK cua Hung: " + sv1.getDiemGK()
        );
    }
}