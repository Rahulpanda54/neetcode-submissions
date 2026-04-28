
class Solution {
 
      List<Integer> ds = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        Inorder(root);

        return ds;
    }

    public void Inorder(TreeNode root){

        if(root == null){
            return;
        }

        Inorder(root.left);
        ds.add(root.val);
        Inorder(root.right);
    }
}