// package Day 19;
// 34. Find First and Last Position of Element in Sorted Array
public class Day19 {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};
            int start = Search(nums, target, true);
            int end = Search(nums, target, false);
            ans[0] = start;
            ans[1] = end;
            return ans;
    
        }
    
        public static int Search(int nums[] , int target , Boolean findStarIndex) {
            int ans = -1;
            int start = 0;
            int end = nums.length-1;
            while (start<=end) {
                int mid = (start+end)/2;
                
                if (nums[mid]>target) {
                    end = mid-1;
                }else if(target > nums[mid]){
                    start = mid+1;
                }else {
                    ans = mid;
                    if(findStarIndex==true){
                        end = mid -1;
                    }else { 
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }
}
