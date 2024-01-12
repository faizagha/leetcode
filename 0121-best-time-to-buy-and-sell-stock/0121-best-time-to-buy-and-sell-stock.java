class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i] - minPrice;
            if (p > profit){
                profit = p;
            }
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return profit;
    }
}