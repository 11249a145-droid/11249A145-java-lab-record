import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter marks in Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter marks in Subject 5: ");
        m5 = sc.nextInt();
    }
}

class Result extends Marks {
    void calculateResult() {
        int total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5.0;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n--- STUDENT RESULT ---");
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Total    : " + total);
        System.out.println("Average  : " + average);
        System.out.println("Grade    : " + grade);
    }
}

public class Mainn {
    public static void main(String[] args) {
        Result r = new Result();

        r.getStudentDetails();
        r.getMarks();
        r.calculateResult();
    }
}