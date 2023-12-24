public class Day69 {
    class Solution {
        public int buyChoco(int[] prices, int money) {
            Arrays.sort(prices);
            int res = prices[0]+prices[1];
            if(res<=money){
                return money - res;
            }
            return money;
        }
    }
}
