package 100-Days-of-DSA---Java-Challenge.Day 41;

public class Day41 {
    class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            
            return nums[n/2];
        }
    }
}
