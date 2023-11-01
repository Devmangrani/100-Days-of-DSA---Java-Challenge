// package Day 16;
// 7. Reverse Integer
public class Day16 {
    class Solution {
        public int reverse(int x) {
            
            int ans = 0 ;
            while (x!=0) {
                int n = x%10;
    
                if( (ans > Integer.MAX_VALUE / 10) || (ans < Integer.MIN_VALUE/10) ) {
                     return 0 ;}
    
                 ans = (ans*10) + n;
                 x = x/10;
                 
                 }
            
            return ans;
    }
            
        };
    
}
