public class Day40 {
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
  //Validate BST Helper FUnction
    public static boolean isValidBST1(TreeNode root ,TreeNode min ,TreeNode max ) {
        if (root == null) {
            return true;
        }

        if (min != null && root.val <= min.val) {
            return false;
        }

        else if (max != null && root.val >= max.val) {
            return false;
        }
        return isValidBST1(root.left, min, root) && isValidBST1(root.right, root, max);
    }

    public boolean isValidBST(TreeNode root) {
        if (isValidBST1(root, null, null)==true) {
            return true;
        }else{
            return false;
        }
    }
}
}
