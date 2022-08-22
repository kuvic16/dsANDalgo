package leetcode.binary_tree.TraverseTree;

import java.util.*;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traverseList = new ArrayList<Integer>();
        Stack<TreeNode> queue = new Stack<TreeNode>();
        Set<TreeNode> visited = new HashSet<TreeNode>();

        if(root == null) return traverseList;

        queue.push(root);
        TreeNode current = root;
        TreeNode parent = null;
        while(!queue.isEmpty()){
            if(current.left != null){
                current = current.left;
                queue.push(current);
            }else if(current.right != null){

                if (!visited.contains(current)) {
                    visited.add(current);
                    traverseList.add(current.val);
                }
                current = current.right;
                queue.push(current);
            }else if(current.left == null && current.right == null){
                if(!visited.contains(current)){
                    visited.add(current);
                    traverseList.add(current.val);
                }
                queue.pop();

                if(!queue.isEmpty()) {
                    parent = queue.peek();
                    if (parent.left == current) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                    current = parent;
                }
            }
        }
        return traverseList;
    }
}


class BinaryTreeInorderTraversalTest {
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode node3 = new TreeNode(1, null, node2);
        BinaryTreeInorderTraversal btpt = new BinaryTreeInorderTraversal();
        List<Integer> list = btpt.inorderTraversal(node3);
        for(Integer a : list) {
            System.out.println(a);
        }


    }
}