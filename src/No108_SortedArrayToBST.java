public class No108_SortedArrayToBST {
    public static void main(String[] args) {
      int[] arr={-10, -3, 0, 5, 9};
        System.out.print(sortedArrayToBST(arr));
    }
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

    static TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums,0,nums.length-1);
        }
        //we use recursive approach to solve the problem
        static TreeNode CreateBST(int[] nums,int i,int e){
        if(i>e){
            return null;
        }
            int mid=(i+e)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=CreateBST(nums,i,mid-1);
            root.right=CreateBST(nums,mid+1,e);
            return root;
    }
}
