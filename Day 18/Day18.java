// package Day 18;
// 26. Remove Duplicates from Sorted Array
public class Day18 {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        }
    }
}
