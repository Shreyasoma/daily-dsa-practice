import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        int p = sc.nextInt();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        System.out.print("Enter rate: ");
        int rate = sc.nextInt();

        int simpleInterest = (p * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}