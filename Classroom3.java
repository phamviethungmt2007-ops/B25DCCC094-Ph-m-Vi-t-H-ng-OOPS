import java.util.ArrayList;

public class Classroom {

    private String tenLop;

    private ArrayList<Student> danhSachSinhVien;

    public Classroom(String tenLop) {
        this.tenLop = tenLop;
        danhSachSinhVien = new ArrayList<>();
    }

    public void addStudent(Student s) {

        for (Student sv : danhSachSinhVien) {

            if (sv.getMssv().equals(s.getMssv())) {

                throw new IllegalArgumentException(
                    "MSSV " + s.getMssv() + " da ton tai!"
                );
            }
        }

        danhSachSinhVien.add(s);
    }

    public String xepLoai(Student s) {

        double diem = s.diemTrungBinh();

        if (diem >= 8) {
            return "Gioi";
        }
        else if (diem >= 6.5) {
            return "Kha";
        }
        else if (diem >= 5) {
            return "Trung binh";
        }
        else {
            return "Yeu";
        }
    }

    public void inBangDiem() {

        System.out.println(
            "===== BANG DIEM LOP " + tenLop + " ====="
        );

        for (Student sv : danhSachSinhVien) {

            System.out.println(
                sv.getMssv()
                + " - "
                + sv.getName()
                + " - Diem TB: "
                + sv.diemTrungBinh()
                + " - Xep loai: "
                + xepLoai(sv)
            );
        }

        System.out.println(
            "Si so lop: " + danhSachSinhVien.size()
        );
    }
}