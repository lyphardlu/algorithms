class Solution {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int temp = 0;
        int i = 0;
        for(i = 0; i < size; i++) {
            if(buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                temp = prices[i] - buyPrice;
                if(temp > maxProfit) {
                    maxProfit = temp;
                }
            }
        }
        return maxProfit;
    }
}
