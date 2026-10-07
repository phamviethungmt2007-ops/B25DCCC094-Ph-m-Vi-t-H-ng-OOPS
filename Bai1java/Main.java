public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new OfficeEmployee("An", 25, 20),
            new TechnicalEmployee("Bình", 28, 160, 80),
            new OfficeEmployee("Chi", 30, 22),
            new TechnicalEmployee("Dũng", 26, 150, 100)
        };

        for (Employee employee : employees) {
            employee.display();
        }
    }
}