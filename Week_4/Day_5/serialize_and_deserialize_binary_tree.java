package Week_4.Day_5;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class serialize_and_deserialize_binary_tree {
    StringBuilder s = new StringBuilder();
    public String serialize(TreeNode root) {
        helper1(root,s);
        return s.toString();
    }
    private void helper1(TreeNode root, StringBuilder s){
        if(root == null){
            s.append("n,");
            return;
        }
        s.append(root.val).append(',');
        helper1(root.left,s);
        helper1(root.right,s);
    }
    int index = 0;
    public TreeNode deserialize(String data) {
        String[] ar = data.split(",");
        return helper2(ar);
    }
    private TreeNode helper2(String[] data){
        if(data[index].equals("n")){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(data[index++]));
        root.left = helper2(data);
        root.right = helper2(data);
        return root;
    }
}
