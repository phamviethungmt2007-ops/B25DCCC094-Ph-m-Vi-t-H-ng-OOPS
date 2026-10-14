import java.util.Calendar;

class Person {
    String name;
    int birthYear;
    String address, phone;

    public Person(String name, int birthYear, String address, String phone) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.phone = phone;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    public void showInfo() {
        System.out.print("Họ tên: " + name + " | Tuổi: " + getAge());
    }
}

class Employee extends Person {
    String id, department;
    double baseSalary;
    int startYear;

    public Employee(String name, int birthYear, String address, String phone, String id, String department, double baseSalary, int startYear) {
        super(name, birthYear, address, phone);
        this.id = id;
        this.department = department;
        this.baseSalary = baseSalary;
        this.startYear = startYear;
    }

    public double calculateSalary() {
        int years = Calendar.getInstance().get(Calendar.YEAR) - startYear;
        return baseSalary + (years * 200000);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(" | Lương: " + calculateSalary());
    }
}

class Developer extends Employee {
    String language;
    int otHours;
    double otRate;

    public Developer(String name, int birthYear, String address, String phone, String id, String department, double baseSalary, int startYear, String language, int otHours, double otRate) {
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.language = language;
        this.otHours = otHours;
        this.otRate = otRate;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (otHours * otRate);
    }
}

class Manager extends Employee {
    int teamSize;
    double bonus;

    public Manager(String name, int birthYear, String address, String phone, String id, String department, double baseSalary, int startYear, int teamSize, double bonus) {
        super(name, birthYear, address, phone, id, department, baseSalary, startYear);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (teamSize * bonus);
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo mảng Person chứa các đối tượng
        Person[] list = {
            new Employee("An", 1995, "HN", "0123", "E1", "KT", 8000000, 2022),
            new Developer("Bình", 2000, "DN", "0456", "D1", "IT", 10000000, 2024, "Java", 10, 100000),
            new Manager("Cường", 1985, "SG", "0789", "M1", "QL", 20000000, 2018, 5, 500000)
        };

        double tongLuong = 0;
        int demDev = 0, demMgr = 0;

        for (Person p : list) {
            p.showInfo(); 

            if (p instanceof Employee) {
                tongLuong += ((Employee) p).calculateSalary();
            }

            if (p instanceof Developer) demDev++;
            if (p instanceof Manager) demMgr++;
        }
        System.out.println("Tổng lương công ty: " + tongLuong);
        System.out.println("Số Developer: " + demDev);
        System.out.println("Số Manager: " + demMgr);
    }
}