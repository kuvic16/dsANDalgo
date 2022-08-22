package leetcode.binary_tree.TraverseTree.pre_order;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.*;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> traverseList = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<TreeNode> rightQueue = new Stack<TreeNode>();
        if(root == null) return traverseList;

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; ++i){
                TreeNode cur = queue.peek();
                traverseList.add(cur.val);

                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) rightQueue.push(cur.right);
                if(cur.left == null && !rightQueue.isEmpty()){
                    queue.offer(rightQueue.pop());
                }
                queue.poll();
            }
        }
        return traverseList;
    }
}

class BinaryTreePreorderTraversalTest {
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode node3 = new TreeNode(1, null, node2);
        BinaryTreePreorderTraversal btpt = new BinaryTreePreorderTraversal();
        List<Integer> list = btpt.preorderTraversal(node1);
        System.out.println(list.size());


    }
}