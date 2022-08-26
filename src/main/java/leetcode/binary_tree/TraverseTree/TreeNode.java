package leetcode.binary_tree.TraverseTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode prepareTree(Integer[] nodes){
        Queue<TreeNode> parentQueue = new LinkedList<TreeNode>();
        TreeNode parent = null; int i=1;
        TreeNode root = null;
        for(Integer node : nodes){
            if(parent == null){
                parent = new TreeNode(node);
                root = parent;
                parentQueue.offer(parent);
                continue;
            }
            if(i==1){
                if(node != null) {
                    TreeNode curr = new TreeNode(node);
                    parent.left = curr;
                    parentQueue.offer(curr);
                }
                i += 1;
            }else if(i == 2){
                if(node != null) {
                    TreeNode curr = new TreeNode(node);
                    parent.right = curr;
                    parentQueue.offer(curr);
                }
                i = 1;
                parentQueue.poll();
                if(!parentQueue.isEmpty()) {
                    parent = parentQueue.peek();
                }
            }
        }
        return root;
    }
}
