public class No112_PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        sum = sum-root.val; //in the end, sum should be 0 to return true
        if(root.left==null&&root.right==null&&sum==0){
            return true;
        }
        if(root.left==null&&root.right==null&&sum!=0){
            return false;
        }
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}

