import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        System.out.print("Enter digit to count: ");
        int n = sc.nextInt();

        int count = 0;

        while (num > 0) {
            long rem = num % 10;

            if (rem == n) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Count = " + count);
        sc.close();
    }
}