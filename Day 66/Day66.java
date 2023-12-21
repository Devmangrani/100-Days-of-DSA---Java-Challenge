public class Day66 {
    class Solution {
        public int majorityElement(int[] nums) {
           int n = nums.length;
            int ans = 0;
            HashMap<Integer , Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            for (Integer key : map.keySet()) {
                if (map.get(key) > n/2) {
                  ans = key;
                }
            }
            return ans; 
        }
    }
}
