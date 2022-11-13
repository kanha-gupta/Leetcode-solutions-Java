
import java.util.ArrayList;
import java.util.List;
//below is the Stack method used to solve the question.

public class No94_InorderTraversal {
        //Self defined TreeNode class
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        solution(root, inorder);
        return inorder;
    }
    public void solution(TreeNode root, List<Integer> res) {
        if (root != null) {
            solution(root.left, res);
            res.add(root.val);
            solution(root.right, res);
        }
    }
}


