package Week_4.Day_3;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    public class lowest_common_ancestor_of_a_binary_search_tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left,p,q);
        if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}