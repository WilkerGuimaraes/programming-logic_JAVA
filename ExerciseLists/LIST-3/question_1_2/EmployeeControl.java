package question_1_2;

public class EmployeeControl {
    public static void main(String[] args) {
        Sector administrationSector = new Sector("Administration");
        Sector accountingSector = new Sector("Accounting");
        Sector ITSector = new Sector("I.T.");

        Employee employee1 = new Employee("Carlos", 20, 1200.0, ITSector);
        Employee employee2 = new Employee("Maria", 25, 3500.0, administrationSector);
        Employee employee3 = new Employee("Diego", 30, 875.79, accountingSector);

        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
