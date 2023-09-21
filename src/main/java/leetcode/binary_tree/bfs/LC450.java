package leetcode.binary_tree.bfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        travarse(root, null, key);
        return root;
    }

    public void travarse(TreeNode node, TreeNode parent, int key){
        if(node == null) return;

        if()

        travarse(node.left, node, key);
        travarse(node.right, node, key);
    }
}

class LC450Test {
    public static void main(String[] args){
        LC450 lc450 = new LC450();
        TreeNode root = new TreeNode();
        int key = 0;

        root = root.prepareTree(new Integer[]{5,3,6,2,4,null,7});
        key = 3;

        TreeNode result = lc450.deleteNode(root, key);
        result.print(result);
    }
}
