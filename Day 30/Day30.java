package Day 30;
122. Best Time to Buy and Sell Stock II
public class Day30 {
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            for(int i=0; i<prices.length-1;i++){
              if(prices[i]<prices[i+1]){
                maxProfit += (prices[i+1] - prices[i]);
              }
            }
            return maxProfit;
        }
    }
    
}
