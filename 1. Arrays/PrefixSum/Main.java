
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        // Step 1: Build prefix array
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(prefix));

        // Step 2: Queries
        System.out.println(sumRange(prefix, 0, 2)); // 6
        System.out.println(sumRange(prefix, 1, 3)); // 9
        System.out.println(sumRange(prefix, 2, 4)); // 12
    }

    public static int sumRange(int[] prefix, int left, int right) {
        if (left == 0)
            return prefix[right];
        else
            return prefix[right] - prefix[left - 1];
    }
}