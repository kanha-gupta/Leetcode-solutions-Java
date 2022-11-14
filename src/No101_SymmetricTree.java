public class No101_SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        //we create another method to accept left and right roots for recursion.
        return root==null || isSymmetricMethod(root.left,root.right);
    }
    public boolean isSymmetricMethod(TreeNode left,TreeNode right){
        if(left==null|| right==null){
            //if one of the node is null,other one should be equated to it.
            return left==right;
        }

        if(left.val!=right.val){
            return false;
        }
        return  isSymmetricMethod(left.left,right.right) &&
                isSymmetricMethod(left.right,right.left);
    }
}
