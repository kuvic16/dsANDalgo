package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC1372 {
    int max = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;

        traverse(root, 0, null, null);
        return max;
    }

    public void traverse(TreeNode node, int sum, String dir, String pdir){
        if(node == null) return;

        if(!(dir == null && pdir == null)){
             if(dir.equalsIgnoreCase(pdir)) {
                sum = 1;
            }else sum += 1;
            if(sum > max) max = sum;
        }
       
        
        System.out.println(node.val + ": " + dir + ", " + pdir);

        traverse(node.left, sum, "left", dir);
        traverse(node.right, sum, "right", dir);
    }
}

class LC1372Test{
    public static void main(String[] args){
        LC1372 lc1372 = new LC1372();
        TreeNode root = new TreeNode();
        root = new TreeNode().prepareTree(new Integer[]{1,null,1,1,1,null,null,1,1,null,1,null,null,null,1}); //3
        root = new TreeNode().prepareTree(new Integer[]{1,1,1,null,1,null,null,1,1,null,1}); //4
        root = new TreeNode().prepareTree(new Integer[]{1}); //0
        root = new TreeNode().prepareTree(new Integer[]{1,null,2,3,4,null,null,null,5});

        System.out.println(lc1372.longestZigZag(root));
    }
}