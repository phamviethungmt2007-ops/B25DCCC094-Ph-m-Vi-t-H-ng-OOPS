public abstract class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Lương: " + calculateSalary());
        System.out.println("--------------------");
    }
}