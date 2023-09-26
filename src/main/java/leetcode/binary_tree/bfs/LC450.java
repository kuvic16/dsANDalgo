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

        if(node.val == key) {
            if (node.left == null && node.right == null) {
                if (parent == null) {
                    this.node = null;
                } else if (dir.equalsIgnoreCase("right")) {
                    parent.right = null;
                } else if (dir.equalsIgnoreCase("left")) {
                    parent.left = null;
                }
            }
            if (parent == null && node.left == null && node.right != null) {
                this.node = node.right;
            }
            if (parent == null && node.right == null && node.left != null) {
                this.node = node.left;
            }
            if(node.left != null && node.right != null){
                TreeNode left = node.left;
                TreeNode right = node.right;

                TreeNode p = right;
                while(right.left != null) {
                    p = right;
                    right = right.left;
                }
                if(parent == null){
                    this.node = right;
                    this.node.left = left;
                    if(this.node.right == null){
                        p.left = null;
                        this.node.right = p;
                    }
                }else{
                    parent = right;
                    parent.left = left;
                    if(parent.right == null){
                        p.left = null;
                        parent.right = p;
                    }
                }
            }
            isFound = true;
            return;
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

//        root = root.prepareTree(new Integer[]{1, 3});
//        key = 1;
//
        root = root.prepareTree(new Integer[]{50,30,70,null,40,60,80});
        key = 50;

        root = root.prepareTree(new Integer[]{5,3,6,2,4,null,7});
        key = 5;

        root = root.prepareTree(new Integer[]{4,null,7,6,8,5,null,null,9});
        key = 7;

        //root.print(root);

        TreeNode result = lc450.deleteNode(root, key);
        if(result == null) System.out.println("[]");
        else result.print(result);
    }
}
