import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a fruit name: ");
        String fruit = sc.nextLine().toLowerCase();

        switch (fruit) {
            case "mango":
                System.out.println("Mango is known as the king of fruits. It is juicy, sweet, and rich in vitamins.");
                break;

            case "apple":
                System.out.println("Apple is a sweet and crunchy fruit, often red or green, and very good for health.");
                break;

            case "orange":
                System.out.println("Orange is a citrus fruit that is juicy, slightly tangy, and rich in vitamin C.");
                break;

            case "grape":
                System.out.println(
                        "Grapes are small, juicy fruits that grow in bunches and can be sweet or slightly sour.");
                break;

            default:
                System.out.println("Please enter a valid fruit.");
        }

        sc.close();
    }
}