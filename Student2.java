public class Student {

    private static int counter = 0;

    private String mssv;
    private String name;
    private double diemCC;
    private double diemGK;
    private double diemCK;

    private String email;
    private String sdt;

    public Student(String name, double diemCC,
                   double diemGK, double diemCK) {

        counter++;

        this.mssv = String.format("B21DCCN%03d", counter);

        this.name = name;
        this.diemCC = diemCC;
        this.diemGK = diemGK;
        this.diemCK = diemCK;
    }

    public String getMssv() {
        return mssv;
    }

    public String getName() {
        return name;
    }

    public double getDiemCC() {
        return diemCC;
    }

    public double getDiemGK() {
        return diemGK;
    }

    public double getDiemCK() {
        return diemCK;
    }

    public String getEmail() {
        return email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setDiemCC(double diemCC) {
        if (diemCC >= 0 && diemCC <= 10) {
            this.diemCC = diemCC;
        }
    }

    public void setDiemGK(double diemGK) {
        if (diemGK >= 0 && diemGK <= 10) {
            this.diemGK = diemGK;
        }
    }

    public void setDiemCK(double diemCK) {
        if (diemCK >= 0 && diemCK <= 10) {
            this.diemCK = diemCK;
        }
    }

    public double diemTrungBinh() {
        return diemCC * 0.1
             + diemGK * 0.3
             + diemCK * 0.6;
    }

    public Student capNhatEmail(String email) {
        this.email = email;
        return this;
    }

    public Student capNhatSdt(String sdt) {
        this.sdt = sdt;
        return this;
    }

    public static int getTotalStudents() {
        return counter;
    }
}