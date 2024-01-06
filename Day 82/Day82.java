public class Day82 {
    class Solution {
        public int change(int amount, int[] coins) {
            int n = coins.length;
            int dp[][] = new int[n+1][amount+1];
            //i -> Coins , sum -> j
            for (int i = 0; i < n+1 ; i++) { 
                dp[i][0] = 1;
            }
            for (int i = 0; i < dp[0].length; i++) {
                dp[0][i] = 0;
            }
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < amount+1; j++) {
                    if (coins[i-1] <= j) {//valid
                        dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
                    }else{//In-valid
                        dp[i][j]= dp[i-1][j];
                    }
                }
            }
            return dp[n][amount];
        }
    }
}
