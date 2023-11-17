package Day 32;
94. Binary Tree Inorder Traversal
public class Day32 {
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
    ArrayList<Integer> ans = new ArrayList<>();
      public List<Integer> inorderTraversal(TreeNode root) {
          inorder(root);
          return ans;
      }
      public void inorder(TreeNode root){
        if(root == null){
            return;
          }
          inorder(root.left);
          ans.add(root.val);
          inorder(root.right);
      }
  }
}
