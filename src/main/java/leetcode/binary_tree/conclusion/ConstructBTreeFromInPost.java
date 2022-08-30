package leetcode.binary_tree.conclusion;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConstructBTreeFromInPost {

    private int currIndex = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode();
        currIndex = postorder.length - 1;
        buildTree(inorder, postorder, root);
        return root;
    }

    private void buildTree(int[] list, int[] postorder, TreeNode parent){
        if(currIndex > 0) {
            int curr = postorder[currIndex--];
            List<Integer> left = new ArrayList<Integer>();
            List<Integer> right = new ArrayList<Integer>();
            boolean found = false;
            for (int i : list) {
                if (i == curr) {
                    found = true;
                    continue;
                }
                if (found == false) {
                    left.add(i);
                } else {
                    right.add(i);
                }
            }
            TreeNode node = new TreeNode(curr);
            if (parent != null) {
                parent.left = node;
            }

            int[] lefarr = new int[left.size()];
            int i = 0;
            for (Integer l : left) {
                lefarr[i++] = l;
            }

            if (lefarr.length > 0) {
                buildTree(lefarr, postorder, node);
            }
        }
    }

    public void traverse(TreeNode root){
        if(root != null){
            traverse(root.left);
            System.out.print(root.val + " ");
            traverse(root.right);
        }
    }

}

class ConstructBTreeFromInPostTest{
    public static void main(String[] args) {
//        Integer[] nodes = new Integer[]{1,2,2,3,4,4,3};
//        Integer[] nodes = new Integer[]{1,2,3};
//        Integer[] nodes = new Integer[]{1,2,2,null,3,null,3};
//        Integer[] nodes = new Integer[]{2,3,3,4,5,5,4,null,null,8,9,null,null,9,8};
//        Integer[] nodes = new Integer[]{1,2,2,2,null,2};
//        Integer[] nodes = new Integer[]{3,9,20,null,null,15,7};
//        TreeNode root = new TreeNode().prepareTree(nodes);

        ConstructBTreeFromInPost c = new ConstructBTreeFromInPost();

        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        // 3,9,20,null,null,15,7
        c.buildTree(inorder, postorder);
        //c.traverse(root);
    }
}
