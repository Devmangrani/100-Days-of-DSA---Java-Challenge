// package 100-Days-of-DSA---Java-Challenge.Day 50;

public class Day50 {
    class Solution {
        public int countCharacters(String[] words, String chars) {
            int count[] = new int[26];
            for(int i=0;i<chars.length();i++){
              count[chars.charAt(i)-'a']++;
            }
            int ans =  0;
            for(String s : words){
              if(canForm(s, count)){
                ans+=s.length();
              }
            }
            return ans;
        }
        boolean canForm(String word, int[] counts)
        {
            int[] c = new int[26];
      
            for(int i =0;i<word.length();i++)
            {
                int x = word.charAt(i)-'a';
                c[x]++;
                if(c[x] > counts[x])
                    return false;
            }
            return true;
        }
    }
}
