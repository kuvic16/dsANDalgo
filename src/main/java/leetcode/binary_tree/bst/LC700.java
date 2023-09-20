package leetcode.binary_tree.bst;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC700 {
    TreeNode result = null;
    public TreeNode searchBST(TreeNode root, int val) {
        traverse(root, val);
        return result;
    }

    public void traverse(TreeNode node, int val){
        if(node == null) return;

        if(node.val == val) {
            result = node;
            return;
        }

        traverse(node.left, val);
        traverse(node.right, val);
    }
}

class LC700Test {
    public static void main(String[] args){
        LC700 lc700 = new LC700();
        TreeNode root = new TreeNode();
        int n = 0;

        root = root.prepareTree(new Integer[]{4,2,7,1,3});
        n = 2;

        root = root.prepareTree(new Integer[]{4,2,7,1,3});
        n = 5;

        TreeNode result = lc700.searchBST(root, n);
        result.print(result);
    }
}

