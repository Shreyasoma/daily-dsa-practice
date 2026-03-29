public class Main {
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 90, 7, 88, 23, 4, 16 };
        int target = 14;
        System.out.println(linearSearch(arr, target));
    }
}