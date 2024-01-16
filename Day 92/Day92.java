public class Day92 {
    class Solution {
        public int numberOfArithmeticSlices(int[] nums) {
            int n = nums.length;
            int totalCount = 0;
            HashMap<Long, Integer>[] dp = new HashMap[n];
            for (int i = 0; i < n; i++) {
                dp[i] = new HashMap<>();
            }
            for (int i = 1; i < n; ++i) {
                for (int j = 0; j < i; ++j) {
                    long diff = (long) nums[i] - nums[j];       
                    if (diff < Integer.MIN_VALUE || diff > Integer.MAX_VALUE)
                        continue;
                    int count = dp[j].containsKey(diff) ? dp[j].get(diff) : 0;
                    totalCount += count;
                    dp[i].put(diff, dp[i].getOrDefault(diff, 0) + count + 1);
                }
            }
            return totalCount;
        }
    }
}
