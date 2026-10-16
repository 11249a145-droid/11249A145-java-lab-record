
import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    void getEmployeeDetails(Scanner sc) {
        System.out.println("---Enter Employee Information---");

        System.out.print("Enter Employee ID:");
        empId = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name:");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary:");
        basicSalary = sc.nextDouble();
    }
}

class PermanentEmployee extends Employee {
    double hra, da, grossSalary;

    void getSalaryDetails(Scanner sc) {
        System.out.print("Enter HRA Amount:");
        hra = sc.nextDouble();

        System.out.print("Enter DA Amount:");
        da = sc.nextDouble();
    }

    void displayDetails() {
        grossSalary = basicSalary + hra + da;

        System.out.println("---Employee Details---");
        System.out.println("Employee ID:" + empId);
        System.out.println("Name:" + name);
        System.out.println("Basic Salary:$" + basicSalary);
        System.out.println("HRA:$" + hra);
        System.out.println("DA:$" + da);
        System.out.println("Gross salary :$" + grossSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PermanentEmployee e = new PermanentEmployee();

        e.getEmployeeDetails(sc);
        e.getSalaryDetails(sc);
        e.displayDetails();

        sc.close();
    }
}
