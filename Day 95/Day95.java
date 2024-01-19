public class Day95 {
    class Solution {
    public int minSteps(String s, String t) {
        int sc[] = new int[26];
        int tc[] = new int[26];
        for(char ch : s.toCharArray()){
          sc[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
          tc[ch - 'a']++;
        }
        int step = 0;
        for(int i = 0 ; i < 26 ; i++){
          step += Math.abs(sc[i]-tc[i]);
        }
        return step/2;
    }
}
}
