public class Main {
    public static int maxSubArray(int[] nums) {
        int curr_sum = nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr_sum = Math.max(nums[i], curr_sum + nums[i]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8};
        System.out.println(maxSubArray(nums));
    }
}
