import java.util.Scanner;

public class StudentResult {

    // Base Superclass
    static class Student {
        protected int rollNo;
        protected String name;

        public void getStudentDetails(Scanner scanner) {
            System.out.print("Enter Roll Number: ");
            rollNo = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            System.out.print("Enter Student Name: ");
            name = scanner.nextLine();
        }

        public void displayStudentDetails() {
            System.out.println("\n--- Student Result ---");
            System.out.println("Roll Number : " + rollNo);
            System.out.println("Name        : " + name);
        }
    }

    // Intermediate Class inheriting from Student
    static class Marks extends Student {
        protected double[] marks = new double[5];

        public void getMarks(Scanner scanner) {
            getStudentDetails(scanner);
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }
        }
    }

    // Derived Class inheriting from Marks (Multilevel Inheritance)
    static class Result extends Marks {
        private double total;
        private double average;
        private char grade;

        public void calculateResult() {
            total = 0;
            for (double mark : marks) {
                total += mark;
            }
            average = total / 5;

            if (average >= 90) grade = 'A';
            else if (average >= 75) grade = 'B';
            else if (average >= 50) grade = 'C';
            else grade = 'F';
        }

        public void displayResult() {
            displayStudentDetails();
            System.out.println("Total Marks : " + total + " / 500");
            System.out.println("Average     : " + average + "%");
            System.out.println("Grade       : " + grade);
        }
    }

    // Main method matching file name StudentResult.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result studentResult = new Result();

        System.out.println("--- Enter Student Details ---");
        studentResult.getMarks(scanner);
        studentResult.calculateResult();
        studentResult.displayResult();

        scanner.close();
    }
}