
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
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
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = root;

            while (node != null || !stack.isEmpty()) {
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
                list.add(stack.peek().val);
                node = stack.pop().right;
            }
            return list;
        }
}


