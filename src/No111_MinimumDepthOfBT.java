public class No111_MinimumDepthOfBT {
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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lh=minDepth(root.left);
        int rh=minDepth(root.right);

        if(lh==0 || rh==0){
            return 1+Math.max(rh,lh);
        } //For skew trees.

        return 1+ Math.min(lh,rh); //1 is there for default to count the root node
    }
}
