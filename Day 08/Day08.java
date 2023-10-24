// package Day 08;
//238. Product of Array Except Self

public class Day08 {
    
        public static int[] productExceptSelf(int[] nums) {
            int prefixProdStart[] = new int[nums.length];
            int prefixProdEnd[] = new int[nums.length];
            int ans[] = new int[nums.length];
    
            //PREFIX product from Start
            prefixProdStart[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixProdStart[i] = prefixProdStart[i-1]*nums[i];
                System.out.println(prefixProdStart[i]);
            }
            
            //PREFIX product from End
            prefixProdEnd[nums.length-1] = nums[nums.length-1];
            for (int i = nums.length-2; i >=0 ; i--) {
                prefixProdEnd[i] = prefixProdEnd[i+1]*nums[i];
                System.out.println(prefixProdEnd[i]);
            }
    
    
            ans[0]= prefixProdEnd[1];
            ans[nums.length-1] = prefixProdStart[nums.length-2];
            //n-2 isliye liya kyuki n-1 le lete tho bhi ith value bhi include hotaji n-2 liya matlab ith value calculate nhi hui
            for (int i = 1; i < nums.length-1; i++) {
                ans[i] = prefixProdStart[i-1]*prefixProdEnd[i+1];
            }
            return ans;
        }

        public static void main(String[] args) {
            int nums[] = {1,2,3,4};
            System.out.println(productExceptSelf(nums));
        }
    
}
