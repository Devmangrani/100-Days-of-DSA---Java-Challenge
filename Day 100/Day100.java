public class Day100 {
    class Solution {
        public int minFallingPathSum(int[][] matrix) {
          int r = matrix.length;
          int c = matrix[0].length;
            int ans = Integer.MAX_VALUE;
            HashMap<String , Integer> map = new HashMap<>();
            // int dp[][] = new int[n+1]][n+1];
            for(int i = 0 ; i < c ; i++){
              ans = Math.min( ans , rec(0 , i , matrix , map));
            }
            return ans;
        }
        public int rec(int i , int j , int arr[][] , HashMap<String , Integer> map){
          if(i == arr.length){
            return 0;
          }
          if( j < 0 || j >= arr[0].length){
            return Integer.MAX_VALUE;
          }
          String key = i + "code" + j;
          if(map.containsKey(key)){
            return map.get(key);
          }
          int op1 = rec(i+1 , j , arr , map);
          int op2 = rec(i+1 , j-1 , arr ,map);
          int op3 = rec(i+1 , j+1 , arr ,map);
    
          map.put(key , arr[i][j] + Math.min(op1 , Math.min(op2 , op3)));
          return arr[i][j] + Math.min(op1, Math.min(op2 , op3));
        }
    }
}
