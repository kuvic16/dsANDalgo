package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC437 {

    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        traverse(root, 0, targetSum, "");
        return count;
    }

    public void traverse(TreeNode node, int sum, int targetSum, String rail){
        if(node == null) return;

        //if((sum + node.val) <= targetSum) sum += node.val;
        rail += node.val + ">";
        sum += node.val;
        if(sum == targetSum){
            count += 1;
            //System.out.println(node.val + ": " + sum);
            //node.left = null;
            //node.right = null;
        }
        //else
        System.out.println(node.val + ": " + sum);
        traverse(node.left, sum, targetSum, rail);
        traverse(node.right, sum, targetSum, rail);

    }
}

class LC437Test{
    public static void main(String[] args){
        LC437 lc437 = new LC437();
        //TreeNode root = new TreeNode().prepareTree(new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1});
        //int targetSum = 8;
        TreeNode root = new TreeNode().prepareTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1});
        int targetSum = 22;
        System.out.println(lc437.pathSum(root, targetSum));
    }
}
