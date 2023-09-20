package leetcode.binary_tree.bfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LC1161 {
    HashMap<Integer, Integer> sumList = new HashMap<>();
    public int maxLevelSum(TreeNode root) {
        travarse(root, 1, 1);

        int maxLevel = 0;
        Integer maxSum = null;
        for (Map.Entry<Integer, Integer> entry : sumList.entrySet()) {
            if(maxSum == null || entry.getValue() > maxSum) {
                maxSum = entry.getValue();
                maxLevel = entry.getKey();
            }
        }

        return maxLevel;
    }

    public void travarse(TreeNode node, int l, int p){
        if(node == null) return;
        if(!sumList.containsKey(l)){
            sumList.put(l, node.val);
        }else{
            sumList.put(l, sumList.get(l) + node.val);
        }

        travarse(node.left, l+1, l);
        travarse(node.right, l+1, l);
    }
}

class LC1161Test {
    public static void main(String[] args){
        LC1161 lc1161 = new LC1161();
        TreeNode root = new TreeNode();
        root = root.prepareTree(new Integer[]{1,7,0,7,-8,null,null});
        //root = root.prepareTree(new Integer[]{989,null,10250,98693,-89388,null,null,null,-32127});

        System.out.println(lc1161.maxLevelSum(root));
    }
}