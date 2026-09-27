public class Main {

    public static void main(String[] args) {

        Classroom lop = new Classroom("D24DCCN01");

        Student sv1 = new Student(
            "B25DCCC001",
            "Lan",
            8,
            7.5,
            9
        );

        Student sv2 = new Student(
            "B25DCCC002",
            "Nam",
            7,
            8,
            8.5
        );

        Student sv3 = new Student(
            "B25DCCC003",
            "An",
            5,
            5,
            5
        );
        lop.addStudent(sv1);
        lop.addStudent(sv2);
        lop.addStudent(sv3);

        Student svTrung = new Student(
            "B25DCCC001",
            "Hung",
            9,
            9,
            9
        );


        try {

            lop.addStudent(svTrung);

        }
        catch (IllegalArgumentException e) {

            System.out.println(
                "Loi: " + e.getMessage()
            );
        }

        System.out.println();

        lop.inBangDiem();
    }
}
