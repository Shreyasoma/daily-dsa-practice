// Write a program to print the factorial of a number by defining a method named 'Factorial'

public class Main {
    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int result = Factorial(4);
        System.out.println("Factorial = " + result);
    }
}
