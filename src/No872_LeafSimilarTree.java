import java.util.ArrayList;
import java.util.List;

public class No872_LeafSimilarTree {
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        addleaf(root1,list1);
        addleaf(root2,list2);
        if(list1.size() != list2.size()){
            return false;
        }
        for (int i = 0; i < list1.size(); ++i) {
            if(list1.get(i) != list2.get(i)){
                return false;
            }
        }
        return true;
    }
    public void addleaf(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        if(root.left !=null){
            addleaf(root.left,list);
        }
        if(root.right != null){
            addleaf(root.right,list);
        }
    }
}


