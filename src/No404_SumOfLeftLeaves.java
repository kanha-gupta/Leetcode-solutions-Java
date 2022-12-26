public class No404_SumOfLeftLeaves {
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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
            if(root==null){
                return sum;
            }
            if(root.left!=null && root.left.left==null && root.left.right==null){
                sum=sum+root.left.val;
            } //this code skips the root node & gets to left root

            //once it gets to the left node, then the recursion begins.
            sum=sum+sumOfLeftLeaves(root.left);
            sum=sum+sumOfLeftLeaves(root.right);
            return sum;
    }
}
