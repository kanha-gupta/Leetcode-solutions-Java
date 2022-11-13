import java.util.ArrayList;

import java.util.List;

public class No144_PreorderTraversal {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> preorder = new ArrayList<>();
    solution(root, preorder);
    return preorder;
}
    public void solution(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            solution(root.left, res);
            solution(root.right, res);
        }
    }
}
