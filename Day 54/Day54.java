package 100-Days-of-DSA---Java-Challenge.Day 54;

public class Day54 {
    class Solution {
        public String largestOddNumber(String num) {
            for(int i = num.length() - 1; i>=0 ;i--){
                if(Character.getNumericValue(num.charAt(i)) % 2 == 1){
                    return num.substring(0 , i+1);
                }
            }
            return "";
        }
    }
}
