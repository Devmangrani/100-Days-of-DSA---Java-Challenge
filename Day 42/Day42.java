public class Day42 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0 ,nums.length-1);
    }
    public static TreeNode createBST(int arr[] , int start , int end) {
        if (start  > end) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode newNode = new TreeNode(arr[mid]);
        newNode.left = createBST(arr, start, mid-1); //Left SUbtree
        newNode.right = createBST(arr, mid+1, end); //Right Subtree
        return newNode;
    }
}
}
