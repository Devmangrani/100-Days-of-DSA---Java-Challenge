package Day 29;
// https://leetcode.com/problems/largest-rectangle-in-histogram/
// 84. Largest Rectangle in Histogram
public class Day29 {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int maxArea =0;
            int nsr[] = new int[heights.length];
            int nsl[] = new int[heights.length];
    
           //Next Smaller Right
           Stack<Integer> s = new Stack<>();
    
           for (int i = heights.length-1; i >= 0 ; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
           }
    
            //Next Smaller Left
            s = new Stack<>();
    
           for (int i =0;i< heights.length ; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
           }
    
            //Current Area
            //Widht = nsr - nsl - 1
            for (int i = 0; i < heights.length; i++) {
                int height = heights[i];
                int Widht = nsr[i] - nsl[i] - 1;
                int currArea = height * Widht;
                maxArea = Math.max(maxArea, currArea);
            }
            return maxArea;
        }
    }
}
