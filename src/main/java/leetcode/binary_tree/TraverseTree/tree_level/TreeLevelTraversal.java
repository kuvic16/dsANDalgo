package leetcode.binary_tree.TraverseTree.tree_level;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.*;

public class TreeLevelTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> level = new ArrayList<Integer>();

        if(root == null) return levelList;

        queue.offer(root);
        int nextLevel = 1, levelCounter = 0;
        level = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            TreeNode curr = queue.peek();
            level.add(curr.val);
            List<TreeNode> neighbours = new ArrayList<TreeNode>();
            if(curr.left != null) neighbours.add(curr.left);
            if(curr.right != null) neighbours.add(curr.right);
            for(TreeNode treeNode : neighbours){
                queue.offer(treeNode);
            }

            queue.poll();
            levelCounter += 1;

            if(nextLevel == levelCounter) {
                if(level.size() > 0) levelList.add(level);
                level = new ArrayList<Integer>();
                levelCounter = 0;
                nextLevel = queue.size();
            }
        }
        return levelList;
    }
}


class TreeLevelTraversalTest {
    public static void main(String[] args){
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode node3 = new TreeNode(1, null, node2);


//        TreeNode node1 = new TreeNode(4);
//        TreeNode node2 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(2, node1, node2);
//        TreeNode node4 = new TreeNode(3);
//        TreeNode node5 = new TreeNode(1, node3, node4);

        TreeLevelTraversal btpt = new TreeLevelTraversal();
        btpt.levelOrder(node3);
        //btpt.levelOrder(node5);


    }
}