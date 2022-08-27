package leetcode.binary_tree.solve_recursively;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SemanticTree {

    public int totalLeft = 0;
    public int totalRight = 0;

    public boolean isSymmetric(TreeNode root){
        List<TreeNode> leftList = new ArrayList<TreeNode>();
        traverse(root.left, leftList);
//        for (TreeNode i : leftList) {
//            System.out.print(i.val + " ");
//        }
//        System.out.println();

        List<TreeNode> rightList = new ArrayList<TreeNode>();
        traverse(root.right, rightList);
//        for (TreeNode i : rightList) {
//            System.out.print(i.val + " ");
//        }
//        System.out.println();

        if(rightList.size() != leftList.size()) return false;

        int j= rightList.size() - 1;
        for(int i=0; i<leftList.size(); i++){

            TreeNode leftNode = leftList.get(i);
            TreeNode rightNode = rightList.get(j--);

            if(leftNode.val != rightNode.val){
                return false;
            }

            if(leftNode.right == null && rightNode.left != null){
                return false;
            }else if(leftNode.right != null && rightNode.left == null){
                return false;
            }else if(leftNode.right != null && rightNode.left != null && leftNode.right.val != rightNode.left.val){
                return false;
            }

            if(leftNode.left == null && rightNode.right != null){
                return false;
            }else if(leftNode.left != null && rightNode.right == null){
                return false;
            }else if(leftNode.left != null && rightNode.right != null && leftNode.left.val != rightNode.right.val){
                return false;
            }


        }
        return true;
    }

    public void traverse(TreeNode root, List<TreeNode> list){
        if(root != null){
            traverse(root.left, list);
            list.add(root);
            traverse(root.right, list);
        }
    }

}

class SemanticTreeTest{
    public static void main(String[] args) {
//        Integer[] nodes = new Integer[]{1,2,2,3,4,4,3};
//        Integer[] nodes = new Integer[]{1,2,3};
//        Integer[] nodes = new Integer[]{1,2,2,null,3,null,3};
//        Integer[] nodes = new Integer[]{2,3,3,4,5,5,4,null,null,8,9,null,null,9,8};
        Integer[] nodes = new Integer[]{1,2,2,2,null,2};
        TreeNode root = new TreeNode().prepareTree(nodes);

        SemanticTree st = new SemanticTree();
        System.out.println(st.isSymmetric(root));
        //MaximumDepthBottomToTop mdttb = new MaximumDepthBottomToTop();
        //System.out.println(mdttb.getMaximumDepth(root));
    }
}
