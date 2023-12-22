public class Day67 {
    class Solution {
        public int[][] imageSmoother(int[][] img) {
            int r = img.length;
            int c = img[0].length;
            int res[][] = new int[r][c];
    
            for(int i = 0 ; i < r ; i++){
              for(int j = 0 ; j < c ; j++){
                res[i][j] = average(img, i, j, r, c);
              }
            }
            return res;
        }
    
        public int average(int img[][], int r , int c , int rows, int cols){
          int total = 0;
          int count = 0;
    
          int top = Math.max(0 , r-1);
          int bottom = Math.min(rows , r+2);
          int left = Math.max(0 , c-1);
          int right = Math.min(cols , c+2);
    
                for(int l = top; l < bottom; l++){
                  for(int k = left ; k < right ; k++){
                    total +=  img[l][k];
                    count += 1;
                  }
                }
                return total/count;
        }
    }
}
