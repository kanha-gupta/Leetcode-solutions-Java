public class No226_InvertBinaryTree {
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
    public TreeNode invertTree(TreeNode root) {
        //recursive approach
        if(root==null){
            return root;
        }//base condition
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
