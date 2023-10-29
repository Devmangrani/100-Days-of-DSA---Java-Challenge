public class Day13 {
    
        public boolean isPalindrome(String s) {
          s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            for (int i = 0; i < s.length()/2; i++) {
                int n = s.length()-i-1;
                if (s.charAt(i)!=s.charAt(n)) {
                    return false;
                }
            }
            return true;
        }
    
    public static void main(String[] args) {
        
    }
}
