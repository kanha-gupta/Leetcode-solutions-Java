public class No98_isvValidBST {
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


    public boolean isValidBST(TreeNode root) {
        //solution involves putting conditions when BST is false
        //if false condition doesnt take place then its a valid BST
        return isValidBST(root, null, null);
    }
    public boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode){
        if(root==null){
            return true;
        }
        if(minNode !=null && root.val <= minNode.val){
            return false;
        }
        if(maxNode !=null && root.val >= maxNode.val){
            return false;
        }
        return isValidBST(root.left, minNode, root) &&
                isValidBST(root.right, root, maxNode);
    }
}
