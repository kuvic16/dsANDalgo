package leetcode.binary_tree.TraverseTree.in_order;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderRecursive {

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res){
        if(root != null){
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }
}

class InorderRecursiveTest{
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode node3 = new TreeNode(1, null, node2);
        InorderRecursive inr = new InorderRecursive();
        for(Integer a : inr.inorderTraversal(node3)) {
            System.out.println(a);
        }
    }
}
