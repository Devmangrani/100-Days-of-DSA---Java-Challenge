// package Day 05;
// 121. Best Time to Buy and Sell Stock
public class Day05 {
    
        public int maxProfit(int[] prices) {
            int buyPrice = Integer.MAX_VALUE;
            int MaxProfit = 0;
            for(int i = 0; i<prices.length ;i++){
              if (buyPrice<prices[i]) {
                int Profit = prices[i] - buyPrice;
                MaxProfit = Math.max(MaxProfit , Profit);
    
              }else{
                buyPrice = prices[i];
              }
            }
            return MaxProfit;
        }
    
        public static void main(String[] args) {
            
        }
}
