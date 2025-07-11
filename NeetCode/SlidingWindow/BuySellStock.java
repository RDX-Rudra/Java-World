class BuySellStock{
    // Leetcode 121
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minbuyPrice = prices[0];
        for(int sell = 1; sell < prices.length; sell++) {
            maxProfit = Math.max(maxProfit, prices[sell] - minbuyPrice);
            minbuyPrice = Math.min(minbuyPrice, prices[sell]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BuySellStock obj = new BuySellStock();
        int[] prices = {10,1,5,6,7,1};
        System.out.println(obj.maxProfit(prices)); // Output: 6
    }
}