package Day 35;

public class Day35 {
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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }
    //Diameter of a Tree
     public static int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        int leftHeight = hight(root.left);
        int rightHeight = hight(root.right);
        int SelfDia = leftHeight + rightHeight;
        return Math.max(rightDia, Math.max(SelfDia , leftDia));
     }
     //Height of a Tree
    public static int hight(TreeNode root) {
        if (root == null) {
            return 0 ;
        } 

        int leftHeight = hight(root.left);
        int rightHeight = hight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
     } 
}
}
