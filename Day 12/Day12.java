// package Day 12;
// 11. Container With Most Water
public class Day12 {
    
        public int maxArea(int[] height) {
            int maxWater = 0;
            int lp = 0;
            int rp = height.length-1;
            while (lp<rp) {
                //calculate water area
                int ht =Math.min(height[lp], height[rp]);
                int wd  = rp - lp;
                int currWater = ht * wd;
                maxWater = Math.max(maxWater, currWater);
                //Update pointer
                if (height[lp]<height[rp]) {
                    lp++;
                }else{
                    rp--;
                }
            }
            return maxWater;
        }
    public static void main(String[] args) {
        
    }
}
