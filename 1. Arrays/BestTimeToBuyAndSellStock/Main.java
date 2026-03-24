public class Main {
    public static int bestTime(int[] price) {
        int maxProfit = 0;
        int minPrice = price[0];
        for (int i = 0; i < price.length; i++) {
            minPrice = Math.min(minPrice, price[i]);
            maxProfit = Math.max(maxProfit, price[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bestTime(price));
    }
}
