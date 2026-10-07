public class OfficeEmployee extends Employee {
    private int workingDays;

  
    private static final double DAILY_SALARY = 100;

    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }
    public double calculateSalary() {
        return workingDays * DAILY_SALARY;
    }
}