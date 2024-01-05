public class Day81 {
    class Solution {
        public int getLength(int count){
          return count == 1 ? 1 : (count < 10 ? 2 : (count < 100 ? 3 :4));
        }
          public int getLengthOfOptimalCompression(String s, int k) {
              int n = s.length();
              int dp[][] = new int[n+1][k+1];
              for(int i=n ; i>=0 ; i--){
                for(int j = 0; j<=k;j++){
                  if(i == n){
                    dp[n][j] = 0;
                    continue;
                  }
                  dp[i][j] = j>0 ? dp[i+1][j-1]:Integer.MAX_VALUE;
                
                  int poss = j;
                  int count = 0;
                  for(int end = i ; end < n && poss >= 0 ; end ++){
                    if(s.charAt(end) == s.charAt(i)){
                      count++;
                      dp[i][j] = Math.min(dp[i][j] , getLength(count)+dp[end+1][poss] );
                    }else{
                      poss--;
                    }
                  }
                }
              }
              return dp[0][k];
          }
      }
}
