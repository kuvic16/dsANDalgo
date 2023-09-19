package leetcode.binary_tree.bfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC199 {
    List<Integer> list = new ArrayList<>();
    int depth = 0;
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root, 0, "right");
        return list;
    }

    public void traverse(TreeNode node, int c, String dir){
        if(node == null) return;
        if(dir.equalsIgnoreCase("right") && c > depth) depth = c;

        System.out.println(node.val + ":::: " + c + " >>" + depth);

        list.add(node.val);

        traverse(node.right, c+1, "right");
        traverse(node.left, c+1, "left");
    }

//    public void traverse(TreeNode node, int l, int r){
//        if(node == null) return;
//        if(r > depth) depth = r;
//        System.out.println(node.val + ":::: " + l + "," + r + ">>" + depth);
//
//        if(r == depth || (l > depth)) list.add(node.val);
//
//        traverse(node.right, 0, r+1);
//        traverse(node.left, l+1, 0);
//    }
}

class LC199Test {
    public static void main(String[] args) {
        LC199 lc199 = new LC199();
        TreeNode root = new TreeNode();
        //root = root.prepareTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        //root = root.prepareTree(new Integer[]{1,2,3,4});
        //root = root.prepareTree(new Integer[]{1,null,3});
//        root = root.prepareTree(new Integer[]{1,2});
        root = root.prepareTree(new Integer[]{1,2,3,null,null,4});
        List<Integer> result = lc199.rightSideView(root);
        for(Integer r : result) System.out.print(r + " ");
    }
}
