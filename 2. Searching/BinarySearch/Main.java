public class Main {
    public static int binarySerach(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 9, 11, 14, 18, 21, 26, 33, 39, 46 };
        int target = 9;
        System.out.println(binarySerach(arr, target));
    }
}