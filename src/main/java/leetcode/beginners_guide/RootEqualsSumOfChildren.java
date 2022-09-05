package leetcode.beginners_guide;

import leetcode.binary_tree.TraverseTree.TreeNode;


public class RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        if(root == null) return false;

        int parent = root.val;
        int child = 0;
        if(root.left != null) child = root.left.val;
        if(root.right != null) child += root.right.val;

        return parent == child;
    }
}

class RootEqualsSumOfChildrenTest{
    public static void main(String[] args){
        Integer[] nodes = new Integer[]{10,4,6};
        TreeNode treeNode = new TreeNode();
        TreeNode root = treeNode.prepareTree(nodes);

        RootEqualsSumOfChildren resc = new RootEqualsSumOfChildren();
        System.out.println(resc.checkTree(root));
    }
}
