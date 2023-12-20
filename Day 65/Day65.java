// package Day 65;

public class Day65 {
    class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > n/3) {
              list.add(key);
            }
        }
        return list;
    }
}
}
