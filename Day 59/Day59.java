public class Day59 {
    class Solution {
        public int numSpecial(int[][] mat) {
            int r = mat.length;
            int c = mat[0].length;
            int count = 0;
            for(int i=0;i<r;i++){
              for(int j = 0;j<c;j++){
                if(mat[i][j] == 0){
                  continue;
                }
                boolean f = false;
                //Check 0 in Rows
                for(int row=0;row<r;row++){
                  if(row!=i &&mat[row][j] == 1){
                    f = true;
                    break;
                  }
                }
                //Check 0 In cols
                for(int col=0;col<c;col++){
                  if(col!=j &&mat[i][col] == 1){
                    f = true;
                    break;
                  }
                }
                if(f==false){//true hu tho r ya c mein common nikal jayega
                  count++;
                }
              }
            }
            return count;
    
        }
    }
}
