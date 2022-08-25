package leetcode.binary_tree.solve_recursively;

import leetcode.binary_tree.TraverseTree.TreeNode;

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
        for(Integer node : nodes){

        }
    }
}
