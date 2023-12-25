package question_1_2;

public class Employee {
    private static int nextRegistration = 1;

    private int registration;
    private String name;
    private int age;
    private double salary;

    private Sector sector;

    public Employee(String name, int age, double salary, Sector sector) {
        this.registration = nextRegistration++;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sector = sector;
    }

    public int getRegistration() {
        return this.registration;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public Sector getSector() {
        return this.sector;
    }

    public void displayInfo() {
        System.out.println(
            "Registration: " + this.registration +
            " | Name: " + this.name +
            " | Age: " + this.age +
            " | Salary: " + this.salary +
            " | Sector: " + this.sector.getSectorCode() + "-" + this.sector.getSectorName()
        );
    }
}
