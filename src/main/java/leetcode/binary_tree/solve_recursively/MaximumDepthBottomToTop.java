package leetcode.binary_tree.solve_recursively;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class MaximumDepthBottomToTop {
    private int answer;

    public int getMaximumDepth(TreeNode root){
        return maximumDepth(root);
    }

    private int maximumDepth(TreeNode root){
        if(root == null) return 0;
        int left_depth = maximumDepth(root.left);
        int right_depth = maximumDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }
}

class MaximumDepthBottomToTopTest{
    public static void main(String[] args) {
        Integer[] nodes = new Integer[]{3,9,20,null,null,15,7};
        TreeNode root = new TreeNode().prepareTree(nodes);
        MaximumDepthBottomToTop mdttb = new MaximumDepthBottomToTop();
        System.out.println(mdttb.getMaximumDepth(root));
    }
}
