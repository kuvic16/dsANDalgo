package leetcode.binary_tree.TraverseTree.post_order;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostorderRecursive {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res){
        if(root != null){
            helper(root.left, res);
            helper(root.right, res);
            res.add(root.val);
        }
    }


}

class PostorderRecursiveTest{
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode node3 = new TreeNode(1, null, node2);
        PostorderRecursive inr = new PostorderRecursive();
        for(Integer a : inr.inorderTraversal(node3)) {
            System.out.println(a);
        }
    }
}