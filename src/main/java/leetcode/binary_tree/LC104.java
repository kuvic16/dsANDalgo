package leetcode.binary_tree;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC104 {


    int depth = 0;
    public int maxDepth(TreeNode root) {
        traverse(root, depth);
        return depth;
    }

    public void traverse(TreeNode node, int n){
        if(node == null) return;
        n += 1;
        if(n > depth) depth = n;
        traverse(node.left, n);
        traverse(node.right, n);

    }

}

class LC104Test{
    public static void main(String[] args){
//        Integer[] nums = new Integer[]{3,9,20,null,null,15,7};
//        Integer[] nums = new Integer[]{1,null,2};
//        Integer[] nums = new Integer[]{1,2,3,4,null,null,5};
//        Integer[] nums = new Integer[]{1,2};
        Integer[] nums = new Integer[]{1,2,3,4,5};
        TreeNode treeNode= new TreeNode();
        treeNode = treeNode.prepareTree(nums);
        LC104 lc104 = new LC104();
        System.out.println(lc104.maxDepth(treeNode));
    }
}
