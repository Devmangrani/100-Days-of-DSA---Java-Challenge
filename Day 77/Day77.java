public class Day77 {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            if(image[sr][sc] == color){
              return image;
            }
            helper(image , sr , sc , color  , image[sr][sc]);
            return image;
        }
        //O(m*n)
        public void helper(int[][] image, int sr, int sc, int color, int orgcol) {
    
            if (sr<0 || sc<0 || sr>=image.length || sc>=image[0].length ) {
                return;
            }
            if(orgcol != image[sr][sc]){
              return;
            }
            image[sr][sc] = color;
    
            //left
            helper(image, sr, sc-1, color, orgcol);
            //right
            helper(image, sr, sc+1, color, orgcol);
            //up
            helper(image, sr-1, sc, color, orgcol);
            //down
            helper(image, sr+1, sc, color, orgcol);
        }
    }
}
