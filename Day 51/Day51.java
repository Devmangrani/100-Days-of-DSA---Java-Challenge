public class Day51 {
    class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int time =  0;
            for(int i = 1;i < points.length ; i++){
                time = time + calctime(points[i-1],points[i]);
            }
            return time;
        }
    
        public int calctime(int[] from , int[] to){
            int x = Math.abs(from[0] - to[0]);//X- Axis
            int y = Math.abs(from[1] - to[1]);//Y- Axis
    
            return Math.max(x,y);
        }
    }
}
