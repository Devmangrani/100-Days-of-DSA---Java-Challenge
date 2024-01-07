public class Day83 {
    class Solution {
        Integer dp[][];
        public int minDifficulty(int[] jobDiff, int d) {
            if(d > jobDiff.length) return -1;
            dp = new Integer[jobDiff.length][d+1];
            int res = diff(0, jobDiff, d);
            if(res == Integer.MAX_VALUE) return -1;
            return res;
        }
        private int diff(int curr, int jobDiff[], int d) {
            if(curr >= jobDiff.length && d <= 0) return 0;
            if(curr >= jobDiff.length || d <= 0) return Integer.MAX_VALUE;
            if(dp[curr][d] != null) return dp[curr][d];
            int maxDiff = -1;
            int res = Integer.MAX_VALUE;
            for(int i = curr; i<jobDiff.length; i++) {
                maxDiff = Math.max(maxDiff, jobDiff[i]);
                int temp = diff(i+1, jobDiff, d-1);
                if(temp != Integer.MAX_VALUE) res = Math.min(res, maxDiff + temp);
            }
            return dp[curr][d] = res;
        }
    }
}
