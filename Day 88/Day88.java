public class Day88 {
    class Solution {
    public int minOperations(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer , Integer> m :map.entrySet()){
            int t = m.getValue();
            if(t==1){
                return -1;
            }
            count = count + t/3;
            if(t%3 !=0 ){
                count++;
            }
        }
        return count;
    }
}
}
