public class TechnicalEmployee extends Employee {
    private int workingHours;
    private double hourlyRate;

    public TechnicalEmployee(String name, int age, int workingHours, double hourlyRate) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}