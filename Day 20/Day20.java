// package Day 20;
// 36. Valid Sudoku
public class Day20 {
    class Solution {

        public boolean isSafe(char[][] board, int r, int c, int digit){
            //checking row
            for(int i = 0; i<board.length; i++){
                if(board[r][i] == digit){
                    return false;
                }
            }
    
            //checking col
            for(int i = 0; i<board[0].length; i++){
                if(board[i][c] == digit){
                    return false;
                }
            }
            //checking box
            int sqrt = (int) Math.sqrt(board.length);
            int rowStart = r - r%3;
            int colStart = c - c%3;
            for(int row = rowStart; row < rowStart+sqrt; row++){
                for(int col = colStart; col < colStart+sqrt; col++){
                    if(board[row][col] == digit){
                        return false;
                    }
                }
            }
            return true;
        }
    
        public boolean isValid(char[][] board, int r, int c){
            if(c == board[0].length){
                r++;
                c = 0;
            }
    
            //base condition
            if(r == board.length){
                return true;
            }
    
            char digit = board[r][c];
            if(digit != '.'){
                board[r][c] = '.';//change the digit to '.' so it cannot check the curr digit
                if(!isSafe(board, r, c, digit)){//check if digit is present or not 
                    return false;//invalid sudoku
                }
                //backtrack
                board[r][c] = digit;//after checking change it to its initial value
            }
            return isValid(board, r, c+1);
        }
    
        public boolean isValidSudoku(char[][] board) {
            return isValid(board, 0, 0);
        }
    }
}
