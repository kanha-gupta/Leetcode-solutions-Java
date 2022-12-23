public class No543_DiameterOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
        TreeNode(int data,TreeNode left,TreeNode right){
            this.val=data;
            this.left=left;
            this.right=right;
        }
    }
    int ans=0;//declared outside to work on both functions

    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        } //base condition
        height(root);
        return this.ans;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left); //left node counter
        int rh=height(root.right); //right node counter
        ans=Math.max(ans, lh+rh); //keeps upgrading value when theres a higher value found at any node
        return 1+ Math.max(lh,rh); //+1 because of root node
    }
}
