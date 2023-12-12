public class Day57 {
    class Solution {
        public int findSpecialInteger(int[] arr) {
            int ans = 0;
            for(int i  =0 ;i<arr.length-arr.length/4 ; i++){
                if(arr[i] == arr[i+arr.length/4]){
                     ans = arr[i];
                }
            }
            return ans;
        }
    }
}
