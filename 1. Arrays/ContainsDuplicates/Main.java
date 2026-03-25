
import java.util.HashSet;

public class Main {
    public static boolean containsDuplicates1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicates2(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) { // the current number you're looking at
                return true; // duplicate found
            }
            seen.add(nums[i]); // remember this number for future
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1 };
        System.out.println("Brute force:" + containsDuplicates1(nums));
        System.out.println("Optimized:" + containsDuplicates2(nums));
    }
}
