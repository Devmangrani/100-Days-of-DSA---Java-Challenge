// package Day 04;
//31. Next Permutation
public class Day04 {
    
        public static void swap(int nums[],int i , int j){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
        public static void reverse(int nums[], int i, int j){
          while(i <=j){
            swap(nums,i++,j--);
          }
        }
          public static void nextPermutation(int[] nums) {
            //Step-1
              int indx = -1;
              for(int i=nums.length-2;i>=0;i--){
                 if(nums[i]<nums[i+1]){
                   indx = i;
                   break;
                 }
              }
              
              if(indx == -1){
                reverse(nums,0,nums.length-1);
              }else {
                //Step-2
                for(int i = nums.length-1;i>=indx;i--){
                  if(nums[i] > nums[indx]){
                    swap(nums,i,indx);
                    break;
                  }
                }
                //Step-3
                reverse(nums,indx+1,nums.length-1);
              }
          }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        nextPermutation(nums);
    }
}
