package leetcode.binary_tree.bfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC450 {
    public boolean isFound = false;
    public TreeNode node;
    // public TreeNode deleteNode(TreeNode root, int key) {
    //     node = root;
    //     travarse(node, null, key, "");
    //     return node;
    // }

    // public void travarse(TreeNode node, TreeNode parent, int key, String dir){
    //     if(node == null) return;
    //     if(isFound) return;

    //     if(node.val == key) {
    //         if (node.left == null && node.right == null) {
    //             if (parent == null) {
    //                 this.node = null;
    //             } else if (dir.equalsIgnoreCase("right")) {
    //                 parent.right = null;
    //             } else if (dir.equalsIgnoreCase("left")) {
    //                 parent.left = null;
    //             }
    //         }
    //         if (parent == null && node.left == null && node.right != null) {
    //             this.node = node.right;
    //         }
    //         if (parent == null && node.right == null && node.left != null) {
    //             this.node = node.left;
    //         }
    //         if(parent != null && node.right == null && node.left != null){
    //             parent.left = node.left;
    //         }
    //         if(parent != null && node.left == null && node.right != null){
    //             parent.left = node.right;
    //         }
    //         if(node.left != null && node.right != null){
    //             TreeNode right = node.right;

    //             TreeNode p = null;
    //             while(right.left != null) {
    //                 p = right;
    //                 right = right.left;
    //             }
                
    //             node.val = right.val;
    //             if(p == null){
    //                 node.right = null;
    //                 if(right.right != null){
    //                      node.right = right.right;   
    //                 }
    //             } 
    //             else {
    //                 p.left = null;
    //                 if(right.right != null){
    //                      p.right = right.right;   
    //                 }
    //             }
                
    //         }
    //         isFound = true;
    //         return;
    //     }

    //     travarse(node.left, node, key, "left");
    //     travarse(node.right, node, key, "right");
    // }

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(key < root.val)
            root.left = deleteNode(root.left, key);
        else if(key > root.val)
            root.right = deleteNode(root.right, key);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            root.val = minVal(root.right);
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    public int minVal(TreeNode root){
        int min=root.val;
        while(root.left!=null){
            min=root.left.val;
            root=root.left;
        }return min;
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
        // root = root.prepareTree(new Integer[]{50,30,70,null,40,60,80});
        // key = 50;

        root = root.prepareTree(new Integer[]{5,3,6,2,4,null,7}); // 6,3,7,2,4
        key = 5;

        // root = root.prepareTree(new Integer[]{4,null,7,6,8,5,null,null,9});
        // key = 7;

        root = root.prepareTree(new Integer[]{3,1,4,null,2}); // 3,2,4
        key = 1;

        root = root.prepareTree(new Integer[]{3,2,4,1}); // 3,2,4
        key = 2;

        root = root.prepareTree(new Integer[]{2,0,33,null,1,25,40,null,null,11,31,34,45,10,18,29,32,null,36,43,46,4,null,12,24,26,30,null,null,35,39,42,44,null,48,3,9,null,14,22,null,null,27,null,null,null,null,38,null,41,null,null,null,47,49,null,null,5,null,13,15,21,23,null,28,37,null,null,null,null,null,null,null,null,8,null,null,null,17,19,null,null,null,null,null,null,null,7,null,16,null,null,20,6}); // 3,2,4
        key = 33;

        //root.print(root);

        TreeNode result = lc450.deleteNode(root, key);
        if(result == null) System.out.println("[]");
        else result.print(result);
    }
}

// 2,0,33,null,1,25,40,null,null,11,31,34,45,10,18,29,32,null,36,43,46,4,null,12,24,26,30,null,null,35,39,42,44,null,48,3,9,null,14,22,null,null,27,null,null,null,null,38,null,41,null,null,null,47,49,null,null,5,null,13,15,21,23,null,28,37,null,null,null,null,null,null,null,null,8,null,null,null,17,19,null,null,null,null,null,null,null,7,null,16,null,null,20,6
//[2,0,34,null,1,25,40,null,null,11,31,35,45,10,18,29,32,null,36,43,46,4,null,12,24,26,30,null,null,null,39,42,44,null,48,3,9,null,14,22,null,null,27,null,null,38,null,41,null,null,null,47,49,null,null,5,null,13,15,21,23,null,28,37,null,null,null,null,null,null,null,null,8,null,null,null,17,19,null,null,null,null,null,null,null,7,null,16,null,null,20,6]
//2,0,33,1,25,40,11,31,34,45,10,18,29,32,36,43,46,4,12,24,26,30,35,39,42,44,48,3,9,14,22,27,38,41,47,49,5,13,15,21,23,28,37,8,17,19,7,16,20,6