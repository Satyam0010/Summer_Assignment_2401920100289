package Week_4.Day_1;


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
class maximum_depth_of_the_tree {
    public int maxDepth(TreeNode root) {
        int h = depth(root);
        return h;
    }
    private int depth(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
}