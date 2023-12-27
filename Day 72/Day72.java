public class Day72 {
    class Solution {
        public int maxScore(String s) {
            int l = -1;
            int z = 0;
            int o = 0;
            for(int i = 0 ; i<s.length()-1;i++){
              if(s.charAt(i) == '0'){
                z++;
              }else{
                o++;
              }
              l = Math.max(l , z - o);
            }
    
            if(s.charAt(s.length() - 1) == '1'){
              o = o + 1;
            }
            return l + o;
        }
    }
}
