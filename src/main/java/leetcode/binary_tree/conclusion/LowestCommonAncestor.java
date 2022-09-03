package leetcode.binary_tree.conclusion;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LowestCommonAncestor {

    private TreeNode ancestor = null;
    private boolean pPassed = false;
    private boolean qPassed = false;


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root, p.val, q.val);
        return ancestor;
    }

    private void traverse(TreeNode root, int p, int q){
        if(root != null && (root.left != null || root.right != null) && ancestor == null) {
            traverse(root.left, p, q);
            traverse(root.right, p, q);
            //System.out.print(root.val + " ");
            if(ancestor == null) {
                pPassed = false;
                qPassed = false;
                check(root, p, q);
                if (pPassed && qPassed) {
                    ancestor = root;
                }
            }
        }
    }

    private void check(TreeNode root, int p, int q){
        if(root != null && (!pPassed || !qPassed)){
            if(root.val == p) pPassed = true;
            if(root.val == q) qPassed = true;
            check(root.left, p, q);
            check(root.right, p, q);
        }
    }
}

class LowestCommonAncestorTest {
    public static void main(String[] args){
        Integer[] nodes = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = new TreeNode();
        root = root.prepareTree(nodes);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);

//        Integer[] nodes = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
//        TreeNode root = new TreeNode();
//        root = root.prepareTree(nodes);
//        TreeNode p = new TreeNode(5);
//        TreeNode q = new TreeNode(4);

        LowestCommonAncestor btpt = new LowestCommonAncestor();
        TreeNode result = btpt.lowestCommonAncestor(root, p, q);
        if(result != null){
            System.out.println();
            System.out.println(result.val);
        }

    }
}