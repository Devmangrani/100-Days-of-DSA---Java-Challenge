// package Day 24;
// 52. N-Queens II
public class Day24 {
    class Solution {
        public int totalNQueens(int n) {
            boolean board[][]=new boolean[n][n];
            return queens(board,0);
        }
        int queens(boolean[][]board,int row){
          if(row == board.length)  return 1;
            int count=0;
            // place the queen and check row and colum
            for(int col=0;col<board.length;col++)
             // place the queen if it is safe
            if(isSafe(board,row,col))
            { board[row][col]=true;
              count+=queens(board,row + 1);
              board[row][col]=false;
             }
              return count;
        }
        boolean isSafe(boolean [][] board,int row,int col){
           //vertical up
        for (int i = row-1; i >=0; i--) {
                if (board[i][col] == true) {
                    return false;
                }
            }
         //Daigonal left up
            for (int i = row-1,j=col-1; i>=0 && j>=0; i--,j--) {
                if (board[i][j] == true) {
                    return false;
                }
            }
        //Daigonal right up
            for (int i = row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
                if (board[i][j] == true) {
                    return false;
                }
            }
         // if none of the check is false, means ans is true
             return true;
       }   
    }
}
