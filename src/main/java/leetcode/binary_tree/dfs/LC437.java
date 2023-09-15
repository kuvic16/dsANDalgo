package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC437 {

    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        if(root.right == null && root.left == null && root.val == targetSum) return 1;
        traverse(root, 0, targetSum, "");
        return count;
    }

    public void traverseX1(TreeNode node, int sum, int targetSum, String rail){
        if(node == null) return;

        rail += (rail.isEmpty() ? "" : ",") + node.val;
        if(node.left == null && node.right == null) {
            String[] rails = rail.split(",");
            sum = 0;
            for (int i = rails.length - 1; i >= 0; i--) {
                int num = Integer.valueOf(rails[i]);
                if (num == targetSum) count++;
                sum += num;
                if (i < rails.length - 1 && sum == targetSum) {
                    count += 1;
                    break;
                }
            }
            System.out.println(node.val + ": " + rail);
        }
        traverse(node.left, sum, targetSum, rail);
        traverse(node.right, sum, targetSum, rail);
    }

    public void traverse(TreeNode node, int sum, int targetSum, String rail){
        if(node == null) return;

        rail += (rail.isEmpty() ? "" : ",") + node.val;
        String[] rails = rail.split(",");
        sum = 0;
        for (int i = rails.length - 1; i >= 0; i--) {
            int num = Integer.valueOf(rails[i]);
            //if (num == targetSum) count++;
            sum += num;
            if (sum == targetSum) {
                count += 1;
                rail = "" + node.val;
                break;
            }
        }


        System.out.println(node.val + ": " + rail);

        traverse(node.left, sum, targetSum, rail);
        traverse(node.right, sum, targetSum, rail);
    }

    public int pathsum3(int[] num){
        return 0;
    }
}

class LC437Test{
    public static void main(String[] args){
        LC437 lc437 = new LC437();
        TreeNode root = new TreeNode();
        int targetSum = 8;

//        root = new TreeNode().prepareTree(new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1});
//        targetSum = 8;

//        root = new TreeNode().prepareTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1});
//        targetSum = 22;

//        root = new TreeNode().prepareTree(new Integer[]{1});
//        targetSum = 0;

//        root = new TreeNode().prepareTree(new Integer[]{-2,null,-3});
//        targetSum = -5;

        root = new TreeNode().prepareTree(new Integer[]{0,1,1});
        targetSum = 1;

//        root = new TreeNode().prepareTree(new Integer[]{0,1,1});
//        targetSum = 0;

//        root = new TreeNode().prepareTree(new Integer[]{1});
//        targetSum = 1;

//        root = new TreeNode().prepareTree(new Integer[]{1,2});
//        targetSum = 1;

//        root = new TreeNode().prepareTree(new Integer[]{1,null,2,null,3,null,4,null,5});
//        targetSum = 3;
        System.out.println(lc437.pathSum(root, targetSum));

        //System.out.println(lc437.pathsum3(new int[]{}));
    }
}
