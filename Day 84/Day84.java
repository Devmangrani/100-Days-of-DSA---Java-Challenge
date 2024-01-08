public class Day84 {
    class Solution {
        public boolean makeEqual(String[] words) {
            int coun[] = new int[26];
            int n = words.length;
            for(int i = 0; i<n ; i++){
                int l= words[i].length();
                for(int j = 0 ; j < l ; j++){
                    char c = words[i].charAt(j);
                    coun[c  - 'a']++;
                }
            }
            for(int i = 0 ; i < 26 ; i++){
                if(coun[i]%n != 0){
                    return false;
                }
            }
            return true;
        }
    }
}
