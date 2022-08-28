package leetcode.binary_tree.solve_recursively;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    private boolean res = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        traverse(root, 0, targetSum);
        return res;
    }

    public void traverse(TreeNode root, int sum, int targetSum){
        if(root != null){
            sum += root.val;
            //System.out.print(root.val + " ");
            //System.out.print(sum + " ");
            if(root.left == null && root.right == null){
                if(sum == targetSum) res = true;
            }
            traverse(root.left, sum, targetSum);
            traverse(root.right, sum, targetSum);
        }
    }

}

class PathSumTest{
    public static void main(String[] args) {
//        Integer[] nodes = new Integer[]{1,2,2,3,4,4,3};
//        Integer[] nodes = new Integer[]{1,2,3};
//        Integer[] nodes = new Integer[]{1,2,2,null,3,null,3};
//        Integer[] nodes = new Integer[]{2,3,3,4,5,5,4,null,null,8,9,null,null,9,8};
//        Integer[] nodes = new Integer[]{1,2,2,2,null,2};
//        Integer[] nodes = new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1};
        Integer[] nodes = new Integer[]{1,2,3};
        TreeNode root = new TreeNode().prepareTree(nodes);

        PathSum ps = new PathSum();
        System.out.println(ps.hasPathSum(root,  5));

    }
}
