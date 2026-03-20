import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+,-,*,/):");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result = " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result = " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result = " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
        sc.close();
    }
}