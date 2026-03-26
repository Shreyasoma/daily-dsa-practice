import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] intersectionofTwoArrays(int[] nums1, int[] nums2) {
        // Step 1 - build frequency map from nums1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2 & 3 - scan nums2 and collect matches
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resultList.add(num); // add to result
                map.put(num, map.get(num) - 1); // decrease count by 1
            }
        }

        // Convert list to array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 1 };
        int[] nums2 = { 2 };
        System.out.println(Arrays.toString(intersectionofTwoArrays(nums1, nums2)));
    }
}
