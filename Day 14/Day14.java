// package Day 14;
// 242. Valid Anagram
import java.util.*;
public class Day14 {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            
            return Arrays.equals(sChars, tChars);
        }
    }
    public static void main(String[] args) {
        
    }
}
