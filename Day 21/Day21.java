// package Day 21;
// 41. First Missing Positive
public class Day21 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int i = 0;
            while (i<nums.length) {
                //value = index -1
                    int CorrectIndex = nums[i] -1;
                    if (nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[CorrectIndex]) {
                        //Swap it!
                    int temp = nums[i];
                    nums[i] = nums[CorrectIndex];
                    nums[CorrectIndex] = temp;
                    }else {
                        i++;
                    }
                    
                }
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] != j+1) {
                        return j+1 ;
                    }  
                }
    
                return nums.length+1;
        }
    }
}
