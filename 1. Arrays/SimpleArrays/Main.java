import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + i + ":");
            arr[i] = sc.nextInt();
        }
        // printing elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
