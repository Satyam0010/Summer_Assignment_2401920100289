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
 
class same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
    private boolean check(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        if(a.val != b.val) return false;
        return check(a.left,b.left)&&check(a.right,b.right);
    }
}