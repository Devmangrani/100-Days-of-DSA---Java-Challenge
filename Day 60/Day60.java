import java.util.*;
public class Day60 {
    class Solution {

        class row implements Comparable<row>{
           int sol;
           int indx;
   
           //Constructor
           public row(int sol , int indx) {
               this.sol = sol;
               this.indx = indx;
           }
           
           @Override
           public int compareTo(row r2) {
   
               if (this.sol == r2.sol) {
                   return this.indx - r2.indx;
               }else{
                   return this.sol - r2.sol;
               }
           }
       }
       public int[] kWeakestRows(int[][] mat, int k) {
           int arr[] = new int[k];
           PriorityQueue<row> pq = new PriorityQueue<>();
           for (int i = 0; i < mat.length; i++) {
               int count = 0;
               for (int j = 0; j < mat[0].length; j++) {
                   if (mat[i][j] == 1) {
                       count = count +1;
                   }else{
                       count = count +0;
                   }
                   
               }
               pq.add(new row(count, i));
           }
           for (int i = 0; i < k; i++) {
               arr[i] = pq.remove().indx;
           }
           return arr;
       }
   }
}
