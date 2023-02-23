import java.util.ArrayList;
import java.util.List;

public class No257_BinaryTreePaths {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val=data;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        traverse(root, "",result);
        return result;
    }

    public void traverse(TreeNode node,String path, List<String> result){
        if(node==null){
            return;
        }
        path=path+Integer.toString(node.val);
        if(node.left==null && node.right==null){
            result.add(path);
        }
        else { //it keeps adding numbers & arrow till last node is reached. then it appends that in result list. this way
            //both left and right nodes are traversed through recursion called at line 35 & 36
            path=path+"->";
            traverse(node.left,path,result);
            traverse(node.right,path,result);
        }
    }

}
