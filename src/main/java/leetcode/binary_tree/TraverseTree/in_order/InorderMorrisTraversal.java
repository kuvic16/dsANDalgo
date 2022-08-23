package leetcode.binary_tree.TraverseTree.in_order;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderMorrisTraversal {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        TreeNode curr = root;
        TreeNode pre;
        while (curr != null){
            if(curr.left == null){
                res.add(curr.val);
                curr = curr.right;
            }else{
                pre = curr.left;
                while(pre.right != null){
                    pre = pre.right;
                }
                pre.right = curr;
                TreeNode temp = curr;
                curr = curr.left;
                temp.left = null;
            }
        }
        return res;
    }
}

class InorderMorrisTraversalTest{
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode node3 = new TreeNode(1, null, node2);
        InorderMorrisTraversal inr = new InorderMorrisTraversal();
        for(Integer a : inr.inorderTraversal(node3)) {
            System.out.println(a);
        }
    }
}
