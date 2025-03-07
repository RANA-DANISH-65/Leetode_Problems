public class BestTimeToSellStocks {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int num : prices) {
            minPrice = Math.min(minPrice, num);
            maxProfit = Math.max(maxProfit, minPrice - num);

        }
        return maxProfit;
    }
}
