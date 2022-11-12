import java.util.ArrayList;
import java.util.List;

public class No145_PostorderTraversal {
    //recursive approach is used as its faster than stack iterative approach.
    public class TreeNode{
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        solution(root, postOrder);
        return postOrder;
    }
    public void solution(TreeNode root, List<Integer> res) {
        if (root != null) {
            solution(root.left, res);
            solution(root.right, res);
            res.add(root.val);
        }
    }
}


