// package Day 01;
//53. Maximum Subarray
public class Day01 {
    public static int maxSubArray(int[] nums) {
        //Here I have Used kadane's Algorithm
        //in this algo we make 0 to negative sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
