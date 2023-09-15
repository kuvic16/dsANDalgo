package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.math.BigInteger;

public class LC437 {

    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        if(root.right == null && root.left == null && root.val == targetSum) return 1;
        traverse(root, targetSum, new long[]{});
        return count;
    }

    public void traverse(TreeNode node, int targetSum, long[] tail){
        if(node == null) return;

        long[] ntail = new long[tail.length+1];
        for(int i=0; i<tail.length; i++) ntail[i] = tail[i];
        ntail[ntail.length-1] = node.val;

        if(node.val == targetSum) count += 1;
        long sum = 0;
        for (int i = ntail.length - 1; i >= 0; i--) {
            sum = sum + ntail[i];
            if (i != ntail.length - 1 && sum == targetSum) {
                count += 1;
            }
        }
        traverse(node.left, targetSum, ntail);
        traverse(node.right, targetSum, ntail);
    }

//    public void traverseX1(TreeNode node, int targetSum, String rail){
//        if(node == null) return;
//
//        rail += (rail.isEmpty() ? "" : ",") + node.val;
//        String[] rails = rail.split(",");
//
//        if(node.val == targetSum) count += 1;
//        long sum = 0;
//        for (int i = rails.length - 1; i >= 0; i--) {
//            long num = Long.valueOf(rails[i]);
//            sum = sum + num;
//            if (i != rails.length - 1 && sum == targetSum) {
//                count += 1;
//            }
//        }
//        System.out.println(node.val + ": " + rail + ", count=" + count);
//
//        traverse(node.left, targetSum, rail);
//        traverse(node.right, targetSum, rail);
//    }
}

class LC437Test{
    public static void main(String[] args){
        LC437 lc437 = new LC437();
        TreeNode root = new TreeNode();
        int targetSum = 8;

        root = new TreeNode().prepareTree(new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1});
        targetSum = 8;
//
        root = new TreeNode().prepareTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1});
        targetSum = 22;
//
//        root = new TreeNode().prepareTree(new Integer[]{1});
//        targetSum = 0;
//
//        root = new TreeNode().prepareTree(new Integer[]{-2,null,-3});
//        targetSum = -5;

//        root = new TreeNode().prepareTree(new Integer[]{0,1,1});
//        targetSum = 1;

//        root = new TreeNode().prepareTree(new Integer[]{1,2});
//        targetSum = 1;

//        root = new TreeNode().prepareTree(new Integer[]{1,-2,-3,1,3,-2,null,-1});
//        targetSum = -1;

//        root = new TreeNode().prepareTree(new Integer[]{0,1,1});
//        targetSum = 0;
//
//        root = new TreeNode().prepareTree(new Integer[]{1});
//        targetSum = 1;
//
//
//
//        root = new TreeNode().prepareTree(new Integer[]{1,null,2,null,3,null,4,null,5});
//        targetSum = 3;
//
//        root = new TreeNode().prepareTree(new Integer[]{1,0,1,1,2,0,-1,0,1,-1,0,-1,0,1,0});
//        targetSum = 2;
//
//        root = new TreeNode().prepareTree(new Integer[]{1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000});
//        targetSum = 0;

        System.out.println(lc437.pathSum(root, targetSum));

        //System.out.println(lc437.pathsum3(new int[]{}));
    }
}
