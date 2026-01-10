package lc;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LC102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        traverse(root, 0, list);
        return list;
    }

    private void traverse(TreeNode node, int index, List<List<Integer>> list){
        if(node == null) return;
        index += 1;
        if(list.size() == 0 || list.size() < index){
            List<Integer> li = new ArrayList<>();
            li.add(node.val);
            list.add(li);
        }else{
            list.get(index-1).add(node.val);
        }

        if(node.left != null) traverse(node.left, index, list);
        if(node.right != null) traverse(node.right, index, list);
    }
}

class LC102Test {
    public static void main(String[] args) throws FileNotFoundException {
        LC102 lc102 = new LC102();

        TreeNode treeNode = new TreeNode();
        Integer[] nums = {3,9,20,null,null,15,7};
        treeNode = treeNode.prepareTree(nums);
        //treeNode.print(treeNode);

        List<List<Integer>> output = lc102.levelOrder(treeNode);
        for(List<Integer> ls : output){
            for(Integer l : ls) System.out.print(l + " ");
            System.out.println();
        }

        //System.out.println(result);
    }
}
