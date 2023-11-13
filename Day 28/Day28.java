public class Day28 {
    public static void main(String[] args) {
    //1295. Find Numbers with Even Number of Digits
    class Solution {
        public int findNumbers(int[] nums) {
          int count = 0;
            for(int i = 0 ; i<nums.length ; i++){
              int countdigit = 0;
              while(nums[i]>0){
                countdigit++;
                nums[i] = nums[i]/10;
                System.out.println(nums[i]);
              }
              if(countdigit%2 == 0){
                count++;
                
              }
            }
            return count;
        }
    }
    }
}
