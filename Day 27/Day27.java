// package Day 27;
// 81. Search in Rotated Sorted Array II
// Wishing you and your colleagues a joyous and Happy Diwali! ✨🪔
public class Day27 {
    class Solution {
        public boolean search(int[] nums, int target) {
            for(int i =0; i<=nums.length-1; i++){
              if (nums[i]==target) {
                return true;
              }
            }
            return false;
        }
        }
}
