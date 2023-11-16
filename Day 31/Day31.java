package Day 31;
123. Best Time to Buy and Sell Stock III
public class Day31 {
    class Solution {
        public int maxProfit(int[] prices) {
          int buyprice1 = Integer.MAX_VALUE;
          int buyprice2 = Integer.MAX_VALUE;
            int maxProfit1 = 0;
            int maxProfit2 = 0;
            for(int i=0; i<prices.length;i++){
              buyprice1 = Math.min(buyprice1, prices[i]); //lowest
              maxProfit1 = Math.max(maxProfit1, prices[i] - buyprice1); //Highest
              buyprice2 = Math.min(buyprice2, prices[i] - maxProfit1); //lowest
              maxProfit2 = Math.max(maxProfit2, prices[i] - buyprice2); //Highest
            }
            return maxProfit2;
        }
    }
}
