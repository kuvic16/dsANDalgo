package leetcode.binary_tree.bfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC199 {
    List<Integer> list = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root, 0);
        return list;
    }

    public void traverse(TreeNode node, int c){
        if(node == null) return;
        if(!stack.contains(c)){
            list.add(node.val);
            stack.push(c);
        }
        traverse(node.right, c+1);
        traverse(node.left, c+1);
    }

}

class LC199Test {
    public static void main(String[] args) {
        LC199 lc199 = new LC199();
        TreeNode root = new TreeNode();
        root = root.prepareTree(new Integer[]{1, 2, 3, null, 5, null, 4});
        root = root.prepareTree(new Integer[]{1,2,3,4});
        root = root.prepareTree(new Integer[]{1,null,3});
        root = root.prepareTree(new Integer[]{1,2});
        root = root.prepareTree(new Integer[]{1,2,3,null,null,4});
        List<Integer> result = lc199.rightSideView(root);
        for(Integer r : result) System.out.print(r + " ");
    }
}
