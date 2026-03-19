
// checks the case of the first letter entered by the user
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z')
            System.out.println("lowercase");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("uppercase");
        else
            System.out.println("no characters");
    }
}