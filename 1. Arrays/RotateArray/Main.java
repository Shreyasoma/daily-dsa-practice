import java.util.Arrays;

public class Main {
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;

        // Step 1: handle k
        k %= n;
        // Step 2: reverse full array
        reverse(nums, 0, n - 1);
        // Step 3: reverse first k
        reverse(nums, 0, k - 1);
        // Step 4: reverse rest
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int key = 0;
        rotate(nums, key);
        System.out.println(Arrays.toString(nums));
    }
}
