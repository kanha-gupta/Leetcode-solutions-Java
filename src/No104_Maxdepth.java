public class No104_Maxdepth {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }

    public int maxDepth(TreeNode root) {
            if (root==null){
                return 0;
        }
            //+1 is did to return so that it also counts the root node.
            //recursive approach is taken place & the method is kept as an integer in the Math.max function.
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
