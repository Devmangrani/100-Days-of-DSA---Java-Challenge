public class Day33 {
    // 1380. Lucky Numbers in a Matrix
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            ArrayList<Integer> ans = new ArrayList<>();
            int r = matrix.length;
            int c = matrix[0].length;
            int position = 0;
    
            for(int i = 0 ; i < c ; i++){
              int max = 0 ; 
              int min = Integer.MAX_VALUE;
              // System.out.println("Max : " + max);
    
              for(int j = 0 ; j < r ; j++){
                if(matrix[j][i] > max){
                  max = matrix[j][i];
                  position = j;
                  System.out.println(matrix[j][i]);
                  System.out.println("post : " + position);
                }
              }
    
              for(int k = 0 ; k < c ; k++){
                if(matrix[position][k] <= min){
                  min = matrix[position][k];
                  System.out.println("Min : " + min);
                }
              }
    
              if(max == min){
                ans.add(max);
              }
            }
            return ans;
        }
    }
}
