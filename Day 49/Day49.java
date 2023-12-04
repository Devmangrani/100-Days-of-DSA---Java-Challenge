package Day 49;

public class Day49 {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            String n ="";
            String m = "";
            for(int i =0; i<word1.length ; i++){
                n += word1[i];
            }
            for(int i =0; i<word2.length ; i++){
                m += word2[i];
            }
            return n.equals(m);
        }
    }
}
