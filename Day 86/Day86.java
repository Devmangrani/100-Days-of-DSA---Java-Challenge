public class Day86 {
    class Solution {
        public List<List<Integer>> findMatrix(int[] nums) {
            int arr[] =  new int[nums.length+1];
            List<List<Integer>> ans = new ArrayList<>();
            for(int c : nums){
              if(arr[c] >= ans.size()){
                ans.add(new ArrayList<>());
              }
              ans.get(arr[c]).add(c);
              arr[c]++;
            }
            return ans;
        }
    }
}
