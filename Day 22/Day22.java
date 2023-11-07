// package Day 22;
// 50. Pow(x, n)
public class Day22 {
    class Solution {
        public double myPow(double x, int n) {
            if(n==0){
              return 1;
            }
            long N = n;
            if (N < 0) {
                N = -N;
                x = 1 / x;
            }
            if(N%2==0){
              return myPow(x * x,(int)(N/2));
            }
            return x * myPow(x, (int)(N-1));
        }
    }
}
