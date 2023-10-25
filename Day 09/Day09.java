// package Day 09;
// 152. Maximum Product Subarray
public class Day09 {
    
        public int maxProduct(int[] nums) {
            int r = 1;
            int l = 1;
            int ans = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (l==0) {
                    l = 1;
                }
                if (r==0) {
                    r = 1;
                }
                l = l*nums[i];
                r = r*nums[nums.length-1-i];
                ans = Math.max(ans, Math.max(l, r));
            }
            return ans;
        }
    public static void main(String[] args) {
        
    }
}
