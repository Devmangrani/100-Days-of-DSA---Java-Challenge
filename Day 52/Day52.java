public class Day52 {
    class Solution {
        public String largestGoodInteger(String num) {
            String ans ="";
            for(int i =2;i<num.length();i++){
              if(num.charAt(i)==num.charAt(i-1) && num.charAt(i-1) == num.charAt(i-2)){
                if(num.substring(i-2,i+1).compareTo(ans)>0){
                  ans = num.substring(i-2,i+1);
                }
              }
            }
            return ans;
        }
    }
    //.compareTo(ans): This is a method used to compare strings in Java. It returns an integer value that indicates the lexicographical difference between the two strings. If the result is 0, it means the strings are equal. If it's positive, it means the current substring is lexicographically greater than ans.
}
