// package Day 03;
//33. Search in Rotated Sorted Array
public class Day03 {
    public int search(int[] nums, int target) {
        for(int i =0; i<=nums.length-1 ; i++){
          if (nums[i]==target) {
            return i;
          }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
