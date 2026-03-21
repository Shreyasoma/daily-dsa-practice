// import java.util.Scanner;

public class Main {
    public static boolean isArmstrong(int n) {
        int ori = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        if (sum == ori)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // System.out.println(isArmstrong(153));
        // finding how many 3 digit armstrong numbers are there
        for (int i = 100; i <= 1000; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
    }
}