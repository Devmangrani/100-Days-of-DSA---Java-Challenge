public class Day74 {
    class Solution {
        public int minOperations(String s) {
            int c0 = 0;
            int c1 = 0;
            for(int i = 0 ; i < s.length() ; i++){
                if(i % 2 == 0){//Even
                    if(s.charAt(i) == '0'){
                        c1++;
                    }else{
                        c0++;
                    }
                }else{//Odd
                    if(s.charAt(i) == '1'){
                        c1++;
                    }else{
                        c0++;
                    }
                }
            }
            return Math.min(c1 ,c0);
        }
    }
}
