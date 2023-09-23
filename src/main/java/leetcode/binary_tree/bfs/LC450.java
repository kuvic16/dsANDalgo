package leetcode.binary_tree.bfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC450 {
    public boolean isFound = false;
    public TreeNode node;
    public TreeNode deleteNode(TreeNode root, int key) {
        node = root;
        travarse(node, null, key, "");
        return node;
    }

    public void travarse(TreeNode node, TreeNode parent, int key, String dir){
        if(node == null) return;
        if(isFound) return;

        if(node.val == key){
            if(node.left == null && node.right == null && dir.equalsIgnoreCase("left")) {
                parent.left = null;
                isFound = true; return;
            }
            if(node.left == null && node.right == null && dir.equalsIgnoreCase("right")) {
                parent.right = null;
                isFound = true; return;
            }

            if(dir.equalsIgnoreCase("left")){
                parent.left = node.right;
                parent.left.left = node.left;
                isFound = true; return;
            }else{
                parent.right = node.right;
                parent.right.right = node.left;
                isFound = true; return;
            }
            
            
        }

        travarse(node.left, node, key, "left");
        travarse(node.right, node, key, "right");
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
