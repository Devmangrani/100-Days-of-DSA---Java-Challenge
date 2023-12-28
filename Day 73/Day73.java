public class Day73 {
    class Solution {
        public boolean isPathCrossing(String path) {
            int x = 0;
            int y = 0;
            Set<String> vis = new HashSet<>();
            vis.add("0,0");
    
            for(char dir : path.toCharArray()){
              if(dir == 'E'){
                x++;
              }else if(dir == 'W'){
                x--;
              }else if(dir == 'N'){
                y++;
              }else if(dir == 'S'){
                y--;
              }
              String curr = x + "," + y;
              if(vis.contains(curr)){
                return true;
              }
              vis.add(curr);
            }
            return false;
        }
    }
}
