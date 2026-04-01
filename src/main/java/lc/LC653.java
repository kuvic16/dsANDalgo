package lc;


import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC653 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        traverse(root,k, list);

        int left = 0, right = list.size() - 1;
        while(left < right){
            int sum = list.get(left) + list.get(right);
            if(sum == k) return true;
            if(sum < k) left++;
            else right--;
        }
        return false;
    }

    void traverse(TreeNode root, int k, List<Integer> list){
        if(root == null) return;
        traverse(root.right, k, list);
        list.add(root.val);
        traverse(root.left, k, list);
    }


}

class LC653Test {
    public static void main(String[] args){
        LC653 lc653 = new LC653();
        Integer[] nums = new Integer[]{5,3,6,2,4,null,7}; int k = 9;
        TreeNode treeNode = new TreeNode();
        treeNode = treeNode.prepareTree(nums);

        boolean result = lc653.findTarget(treeNode, k);
        System.out.println(result);
    }
}
