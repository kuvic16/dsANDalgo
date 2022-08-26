package leetcode.binary_tree.solve_recursively;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthTopToBottom {
    private int answer;

    private void maximumDepth(TreeNode root, int depth){
        if(root == null) return;
        if(root.left == null && root.right == null){
            answer = Math.max(answer, depth);
        }
        maximumDepth(root.left, depth + 1);
        maximumDepth(root.right, depth + 1);
    }
}

class MaximumDepthTopToBottomTest{
    public static void main(String[] args) {
        Integer[] nodes = new Integer[]{3,9,20,null,null,15,7};
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
                parent = parentQueue.peek();
            }
        }
        System.out.println();
    }
}
