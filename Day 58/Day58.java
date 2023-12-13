class Solution {
    public int maxProduct(int[] nums) {
        int max = nums.length-1;
        Arrays.sort(nums);
        int res = (nums[max]-1)*(nums[max-1]-1);
        return res;
    }
}