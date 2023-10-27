// package Day 11;
//167. Two Sum II - Input Array Is Sorted

public class Day11 {
    
        public int[] twoSum(int[] numbers, int target) {
            int newarr[] = new int[2];
            int left = 0;
            int right = numbers.length-1;
            while(numbers[left] + numbers[right] != target){
              if(numbers[left] + numbers[right]<target){
                left++;
              }else {
                right--;
              }
    
            }
            newarr[0]=left+1;
            newarr[1]=right+1;
            return newarr;
        }
    public static void main(String[] args) {
        
    }
}
