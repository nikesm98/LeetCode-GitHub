class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0] ; 
        int Profit = 0 ; 

        for(int i = 1 ; i < prices.length ; i++ ){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }

            Profit = Math.max(Profit,prices[i] - buyPrice);
        }

        return Profit;
    }
}