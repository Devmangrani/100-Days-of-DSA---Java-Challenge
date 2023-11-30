public class Day45 {
    class Solution {
    public int[] sumZero(int n) {
      int arr[] = new int[n];
      if(n%2 != 0){//Odd
        arr[n-1] = 0;
        for(int i = 0 ; i<n-1; i+=2){
          arr[i] = i+1;
          arr[i+1] = -(i+1);
        }
      }
      else {//Even
        for(int i = 0 ; i<n-1; i+=2){
          arr[i] = i+1;
          arr[i+1] = -(i+1);
        }
      }
      return arr;
    }
}
}
