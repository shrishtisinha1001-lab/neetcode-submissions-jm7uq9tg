class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        int buyPrice = prices[0];
        int maxProfit=0;

        for(int i=0;i<n;i++)
        {
            int currProfit = prices[i]-buyPrice;
            if(currProfit>maxProfit)
            {
                maxProfit = currProfit;
            }
            if(prices[i]<buyPrice)
            {
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
}
