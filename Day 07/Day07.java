// package Day 07;
//42. Trapping Rain Water

public class Day07 {
    
        public static int trap(int[] height) {
            int n = height.length;
            //calculate left max boundary -array
            int leftMax[] = new int[n];
            leftMax[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(height[i], leftMax[i-1]);
                //i-1 kyuki previous element ka compare karna tha 
            }
            //calculate right max boundary -array
            int rightMax[] = new int[n];
            rightMax[n-1] = height[n-1];
            //n-2 se kyu kyuki n-1 ke liye allready count hogayi hn value
            for (int i = n-2; i >= 0; i--) {
                rightMax[i] = Math.max(height[i], rightMax[i+1]);
                //i+1 kyuki Aage wale element se compare karna tha  
            }
            //loop
            int trapedwater = 0;
            for (int i = 0; i < n ; i++) {
                //waterlevel = min(leftmax bound , rightmax bound)
                int waterlevel = Math.min(leftMax[i], rightMax[i]);
                //trapedwater = waterlevel - height[i]
                trapedwater += waterlevel - height[i];
            }
            return trapedwater;
        }

        public static void main(String[] args) {
            int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
            System.out.println(trap(height));
        }
    
}
