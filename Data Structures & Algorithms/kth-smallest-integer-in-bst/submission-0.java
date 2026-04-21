
class Solution {

    List<Integer> ds = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        
          Inorder(root);

          return ds.get(k-1);
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
