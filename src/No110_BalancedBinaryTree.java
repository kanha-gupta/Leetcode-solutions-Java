public class No110_BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }

    boolean flag=true; //kept outside for universal scope
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return flag;
    }
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        if(leftDepth-rightDepth>1 || rightDepth-leftDepth>1){
            flag=false;
        } //the only condition which makes it false
        return Math.max(leftDepth,rightDepth)+1; //gives the max depth of the treeNode
    }
}
