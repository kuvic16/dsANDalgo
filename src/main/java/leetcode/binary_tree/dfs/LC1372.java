package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC1372 {
    int max = 0;
    Boolean isLeft = null;
    public int longestZigZag(TreeNode root) {
        traverse(root, 0, "");
        return max;
    }

    public void traverse(TreeNode node, int sum, String rail){
        if(node == null) return;

        rail += node.val + ",";

        if(isLeft == null && node.left != null){isLeft = true; sum = 1;}
        else if(isLeft == null && node.right != null){isLeft = false; sum = 1;}
        else if(isLeft != null && !isLeft && node.left != null){isLeft = true; sum += 1;}
        else if(isLeft != null && isLeft && node.right != null){isLeft = false; sum += 1;}
        else {
            if(sum > max) max = sum;
            sum = 0;
            isLeft = null;
        }
        
        System.out.println(node.val + "(" + rail + "): " + sum + " -> " + isLeft);

        traverse(node.left, sum, rail);
        traverse(node.right, sum, rail);
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