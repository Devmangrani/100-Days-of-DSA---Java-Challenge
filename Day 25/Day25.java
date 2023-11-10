// package Day 25;
// 74. Search a 2D Matrix
public class Day25 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row =0;
            int col = matrix[0].length-1;
            while(row<matrix.length && col>=0){
              if(matrix[row][col]==target){
                 return true;
              }
              if(target<matrix[row][col]){
              col--;
            }else{
              row++;
            }
            }
            return false;
        }
    }
}
