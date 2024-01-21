public class Day97 {
    class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            Set<Integer> zl = new HashSet<>();
            Set<Integer> ol = new HashSet<>();
            Set<Integer> ml = new HashSet<>();
    
            for(int[] m : matches){
              int w = m[0];
              int l = m[1];
    
              if(!ol.contains(w) && !ml.contains(w)){
                zl.add(w);
              }
              if(zl.contains(l)){
                zl.remove(l);
                ol.add(l);
              }else if(ol.contains(l)){
                ol.remove(l);
                ml.add(l);
              }else if(ml.contains(l)){
                continue;
              }else{
                ol.add(l);
              }
            }
            List<Integer> zli = new ArrayList<>(zl);
            List<Integer> oli = new ArrayList<>(ol);
            Collections.sort(zli);
            Collections.sort(oli);
    
            List<List<Integer>> al = new ArrayList<>();
            al.add(zli);
            al.add(oli);
            return al;
        }
    }
}
