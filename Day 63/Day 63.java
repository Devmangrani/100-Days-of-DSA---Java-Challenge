public class Day 63 {
    class Solution {
        static class pair implements Comparable<pair>{
            int val;
            int indx;
    
            public pair(int val,int indx){
                this.val = val;
                this.indx = indx;
            }
    
            @Override
            public int compareTo(pair p2) {
                // TODO Auto-generated method stub
    
                return p2.val - this.val;
            }
        }
        public int[] maxSlidingWindow(int[] nums, int k) {
            int res[] = new int[nums.length-k+1];
            
            PriorityQueue<pair> pq = new PriorityQueue<>();
            for (int i = 0; i < k; i++) {
                pq.add(new pair(nums[i], i));
            }
            res[0] = pq.peek().val;
            for (int i = k; i < nums.length; i++) {
                while (pq.size() > 0 && pq.peek().indx <= (i-k)) {
                    pq.remove();
                }
                pq.add(new pair(nums[i], i));
                res[i-k+1] = pq.peek().val;
            }
            return res;
        }
    }
}
