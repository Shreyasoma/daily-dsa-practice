public class Main {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // while loop
        int num = 1;
        while (num <= 5) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        // do while loop
        int n = 1;
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 5);
        System.out.println();
    }
}