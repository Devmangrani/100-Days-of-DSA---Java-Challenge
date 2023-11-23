package 100-Days-of-DSA---Java-Challenge.Day 38;

public class Day38 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int n = 0;//nonZeroIndex
            for(int  i = 0; i < nums.length ; i++){
                if(nums[i] != 0){
                    if(i != n){
                        int temp = nums[n];
                        nums[n] = nums[i];
                        nums[i] = temp;
                    }
                    n++;
                }
            }
        }
    }
}
