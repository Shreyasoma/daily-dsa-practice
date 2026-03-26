
import java.util.Arrays;

public class Main {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i] = digits[i] + 1; // just add one
                return digits; // no carry, done
            }

            digits[i] = 0; // this digit becomes 0, carry continues
        }

        // if we reach here, all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1; // put 1 at the front
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 9, 9 };
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
