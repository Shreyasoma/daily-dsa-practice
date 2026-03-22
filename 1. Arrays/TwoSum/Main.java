import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] twoSum1(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == key)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] twoSum2(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = key - current;
            if (map.containsKey(needed)) {
                return new int[] { map.get(needed), i };
            }
            map.put(current, i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 4, 7, 1, 5, 9 };
        int key = 14;
        System.out.println("Brute Force:" + Arrays.toString(twoSum1(nums, key)));
        System.out.println("Optimized:" + Arrays.toString(twoSum2(nums, key)));
    }
}
