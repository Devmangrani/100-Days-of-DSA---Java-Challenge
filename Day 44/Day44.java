package Day 44;

public class Day44 {
    class Solution {
        public int thirdMax(int[] nums) {
          ArrayList<Integer> arr = new ArrayList<>();
            Arrays.sort(nums);
            for(int i =0; i<nums.length-1 ; i++){
              if(nums[i]!=nums[i+1]){
                arr.add(nums[i]);
              }
            }
            arr.add(nums[nums.length-1]);
    
            if(arr.size()<3){
              int temp = arr.get(arr.size()-1);
              return temp;
            }else{
              int temp = arr.get(arr.size()-3);
              return temp;
            }
        }
    }
}
