// package 100-Days-of-DSA---Java-Challenge.Day 61;

public class Day61 {
    class Solution {
        public int[][] onesMinusZeros(int[][] grid) {
            int[] r0 = new int[grid.length];
            int[] c0 = new int[grid[0].length];
            for(int i=0 ; i<grid.length ;i++){
                for(int j=0;j<grid[0].length;j++){
                    r0[i] += grid[i][j];
                    c0[j] += grid[i][j];
                }
            }
            for(int i=0 ; i<grid.length ;i++){
                for(int j=0;j<grid[0].length;j++){
                    grid[i][j] = 2* (r0[i] + c0[j]) - grid.length - grid[0].length;
                }
            }
            return grid;
        }
    }
}
