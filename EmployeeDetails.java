import java.util.Scanner;

// Main outer wrapper matching file name: EmployeeDetails.java
public class EmployeeDetails {

    // Superclass
    static class Employee {
        protected int empID;
        protected String name;
        protected double basicSalary;

        public void getEmployeeDetails(Scanner scanner) {
            System.out.print("Enter Employee ID: ");
            empID = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            System.out.print("Enter Name: ");
            name = scanner.nextLine();
            System.out.print("Enter Basic Salary: ");
            basicSalary = scanner.nextDouble();
        }

        public void displayEmployeeDetails() {
            System.out.println("\n--- Employee Details ---");
            System.out.println("Employee ID   : " + empID);
            System.out.println("Name          : " + name);
            System.out.println("Basic Salary  : $" + basicSalary);
        }
    }

    // Subclass inheriting from Employee
    static class PermanentEmployee extends Employee {
        private double hra; // House Rent Allowance
        private double da;  // Dearness Allowance

        public void getPermanentDetails(Scanner scanner) {
            getEmployeeDetails(scanner);
            System.out.print("Enter HRA Amount: ");
            hra = scanner.nextDouble();
            System.out.print("Enter DA Amount: ");
            da = scanner.nextDouble();
        }

        public double calculateGrossSalary() {
            return basicSalary + hra + da;
        }

        public void displayAllDetails() {
            displayEmployeeDetails();
            System.out.println("HRA           : $" + hra);
            System.out.println("DA            : $" + da);
            System.out.println("Gross Salary  : $" + calculateGrossSalary());
        }
    }

    // Main execution point
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PermanentEmployee emp = new PermanentEmployee();

        System.out.println("--- Enter Employee Information ---");
        emp.getPermanentDetails(scanner);

        emp.displayAllDetails();

        scanner.close();
    }
}