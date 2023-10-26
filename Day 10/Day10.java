import java.util.ArrayList;
import java.util.*;

// package Day 10;
// 15. 3Sum
public class Day10 {
    
        public static void twoSum(int i, int[] nums, ArrayList<List<Integer>> list) {
            int target = 0 - nums[i];
            int left = i+1;
            int right = nums.length-1;
            while (left<right) {
              if (nums[left]+nums[right]>target) {
                right--;
              } else if (nums[left]+nums[right]<target) {
                left++;
              }else{
                list.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                left++;
                right--;
      
                while (left<right && nums[left]==nums[left-1]) {
                  left++;
                }
                while (left<right && nums[right]==nums[right+1]) {
                  right--;
                }
      
              }
            }
        }
      
          public List<List<Integer>> threeSum(int[] nums) {
               Arrays.sort(nums);
               System.out.println(Arrays.toString(nums));
              ArrayList<List<Integer>> list = new ArrayList<>();
              for (int i = 0; i < nums.length-1; i++) {
                if (i>0 && nums[i]==nums[i-1]) {
                  continue;
                }
                twoSum(i,nums,list);
      
              }
              return list;
          }
      
}
