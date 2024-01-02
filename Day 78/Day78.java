public class Day78 {
    class Solution {
        public int numRollsToTarget(int n, int k, int target) {
            int mod = 1_000_000_007;
            int dp[][] = new int[n+1][target + 1];
            dp[0][0] = 1;
            for(int i = 1; i <=n ; i++){
                for(int j = 0 ; j <= target ; j++){
                    for(int face = 1 ; face <= k ; face++){
                        if(j < face){
                            continue;
                        }
                        dp[i][j] = (dp[i][j] + dp[i-1][j-face]) % mod;
                    }
                }
            }
            return dp[n][target];
        }
    }
}
