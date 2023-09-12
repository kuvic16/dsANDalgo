package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LC872 {

    Queue<Integer> leaf1 = new LinkedList<>();
    Queue<Integer> leaf2 = new LinkedList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        traverse(root1, leaf1);
        traverse(root2, leaf2);
        if(leaf1.size() != leaf2.size()) return false;
        while(!leaf1.isEmpty()){
            if(!leaf1.poll().equals(leaf2.poll())) return false;
        }
        return true;
    }

    public void traverse(TreeNode root, Queue<Integer> leaf){
        if(root == null) return;
        traverse(root.left, leaf);
        traverse(root.right, leaf);
        if(root.left == null && root.right == null)
            leaf.offer(root.val);
    }
}

class LC872Test{
    public static void main(String[] args){
        TreeNode root1 = new TreeNode().prepareTree(new Integer[]{3,5,1,6,2,9,8,null,null,7,4});
        TreeNode root2 = new TreeNode().prepareTree(new Integer[]{3,5,1,6,7,4,2,null,null,null,null,null,null,9,8});
//        TreeNode root1 = new TreeNode().prepareTree(new Integer[]{3,5,1,6,2,9,8,null,null,7,14});
//        TreeNode root2 = new TreeNode().prepareTree(new Integer[]{3,5,1,6,71,4,2,null,null,null,null,null,null,9,8});
        LC872 lc872 = new LC872();
        System.out.println(lc872.leafSimilar(root1, root2));
    }
}
