// package Day 23;
// 54. Spiral Matrix
public class Day23 {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            if (matrix == null || matrix.length == 0) {
                return result;
            }
            
            int row = matrix.length;
            int col = matrix[0].length;
            int StartRow = 0; 
            int EndCol = col-1; 
            int StartCol = 0; 
            int EndRow = row-1; 
            
            while (StartCol <= EndCol && StartRow <= EndRow) {
                for (int i = StartCol; i <= EndCol; i++) {
                    result.add(matrix[StartRow][i]);
                }
                StartRow++;
                
                for (int i = StartRow; i <= EndRow; i++) {
                    result.add(matrix[i][EndCol]);
                }
                EndCol--;
                
                if (StartRow <= EndRow) {
                    for (int i = EndCol; i >= StartCol; i--) {
                        result.add(matrix[EndRow][i]);
                    }
                    EndRow--;
                }
                
                if (StartCol <= EndCol) {
                    for (int i = EndRow; i >= StartRow; i--) {
                        result.add(matrix[i][StartCol]);
                    }
                    StartCol++;
                }
            }
            
            return result;
        }
    }
}
