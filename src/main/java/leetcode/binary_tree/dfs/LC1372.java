package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC1372 {
    int max = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;

        traverse(root, "", "");
        return max;
    }

    public void traverse(TreeNode node, String rail, String dir){
        if(node == null) return;

        if(!rail.isEmpty()) rail += ",";
        rail += dir;

        String[] dirs = rail.split(",");
        int sum = 0; String prev = "";
        for(int i=0; i<dirs.length; i++){
            if(!prev.isEmpty() && !dirs[i].equalsIgnoreCase(prev)) sum += 1;
            else sum = 1;
            prev = dirs[i];
        }
        if(sum > max) max = sum;
        
        
        System.out.println(node.val + "(" + rail + "): , Sum: " + sum);

        traverse(node.left, rail, "left");
        traverse(node.right, rail, "right");
    }
}

class LC1372Test{
    public static void main(String[] args){
        LC1372 lc1372 = new LC1372();
        TreeNode root = new TreeNode();
        root = new TreeNode().prepareTree(new Integer[]{1,null,1,1,1,null,null,1,1,null,1,null,null,null,1}); //3
        //root = new TreeNode().prepareTree(new Integer[]{1,1,1,null,1,null,null,1,1,null,1}); //4
        //root = new TreeNode().prepareTree(new Integer[]{1}); //0
        //root = new TreeNode().prepareTree(new Integer[]{1,null,2,3,4,null,null,null,5});

        System.out.println(lc1372.longestZigZag(root));
    }
}