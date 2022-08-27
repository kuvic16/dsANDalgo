package leetcode.binary_tree.solve_recursively;

import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SemanticTree {

    public int totalLeft = 0;
    public int totalRight = 0;

    public boolean isSymmetric(TreeNode root){
        List<Integer> leftList = new ArrayList<Integer>();
        traverse(root.left, leftList);
//        for (Integer i : leftList) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        List<Integer> rightList = new ArrayList<Integer>();
        traverse(root.right, rightList);
//        for (Integer i : rightList) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        if(rightList.size() != leftList.size()) return false;

        int j= rightList.size() - 1;
        for(int i=0; i<leftList.size(); i++){
            if(leftList.get(i) != rightList.get(j--)) return false;
        }
        return true;
    }

    public void traverse(TreeNode root, List<Integer> list){
        if(root != null){
            traverse(root.left, list);
            list.add(root.val);
            traverse(root.right, list);
        }
    }

}

class SemanticTreeTest{
    public static void main(String[] args) {
//        Integer[] nodes = new Integer[]{1,2,2,3,4,4,3};
//        Integer[] nodes = new Integer[]{1,2,3};
//        Integer[] nodes = new Integer[]{1,2,2,null,3,null,3};
        Integer[] nodes = new Integer[]{2,3,3,4,5,5,4,null,null,8,9,null,null,9,8};
        //Integer[] nodes = new Integer[]{1,2,2,2,null,2};
        TreeNode root = new TreeNode().prepareTree(nodes);

        SemanticTree st = new SemanticTree();
        System.out.println(st.isSymmetric(root));
        //MaximumDepthBottomToTop mdttb = new MaximumDepthBottomToTop();
        //System.out.println(mdttb.getMaximumDepth(root));
    }
}
