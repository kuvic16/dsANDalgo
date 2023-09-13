package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC1448 {
    int count = 0;
    public int goodNodes(TreeNode root) {
        traverse(root, null);
        return count;
    }

    public void traverse(TreeNode node, Integer max){
        if(node == null) return;

        if(max == null) max = node.val;
        else if(max < node.val) max = node.val;
        if(max == node.val){
            count += 1;
        }
        //System.out.println(node.val + ": " + sum);
        traverse(node.left, max);
        traverse(node.right, max);
    }
}

class LC1448Test {
    public static void main(String[] args){
        LC1448 lc1448 = new LC1448();
        //TreeNode root = new TreeNode().prepareTree(new Integer[]{3,1,4,3,null,1,5});
//        TreeNode root = new TreeNode().prepareTree(new Integer[]{3,3,null,4,2});
//        TreeNode root = new TreeNode().prepareTree(new Integer[]{1});
        TreeNode root = new TreeNode().prepareTree(new Integer[]{-1,5,-2,4,4,2,-2,null,null,-4,null,-2,3,null,-2,0,null,-1,null,-3,null,-4,-3,3,null,null,null,null,null,null,null,3,-3});
        System.out.println(lc1448.goodNodes(root));
    }
}
