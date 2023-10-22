import java.util.*;
//215. Kth Largest Element in an Array

public class Day06 {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int j= nums[nums.length - k];
        return j;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }
}
