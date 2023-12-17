public class Day62 {
    class Solution {
        public String destCity(List<List<String>> paths) {
            for(List<String> p : paths){
              String city = p.get(1);
              boolean good = true;
    
              for(List<String> op :paths){
                if(op.get(0).equals(city)){
                  good  = false;
                  break;
                }
              }
              if(good == true){
                return city;
              }
            }
            return "";
        }
    }
}
