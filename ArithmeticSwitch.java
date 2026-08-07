import java.util.Scanner;

class ArithmeticSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b;
        int choice;

        System.out.println("Enter first number: ");
        a = sc.nextDouble();

        System.out.println("Enter second number: ");
        b = sc.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Addition = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                System.out.println("Division = " + (a / b));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}