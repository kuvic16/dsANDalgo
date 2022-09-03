package leetcode.binary_tree.conclusion;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LowestCommonAncestor {

    private boolean pPassed = false;
    private boolean qPassed = false;
    private TreeNode currentP = null;
    private TreeNode currentQ = null;
    private TreeNode ancestor = null;



    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root, p.val, q.val, 1, 0, 0);
        return ancestor;
    }

    private void traverse(TreeNode root, int p, int q, int level, int pStep, int qStep){
        if(root != null && ancestor == null){

            traverse(root.left, p, q, level + 1, pStep, qStep);
            traverse(root.right, p, q, level + 1, pStep, qStep);
            //System.out.print(root.val + "(" + level + "-" + left + "," + right + ")" + " ");
            System.out.print(root.val + "(" + pStep + "-" + qStep + ")" + " ");
            if(pPassed && qPassed && ancestor == null){
                ancestor = root;
            }
            if(root.val == p) {
                pPassed = true;
                currentP = root;
            }
            if(root.val == q) {
                qPassed = true;
                currentQ = root;
            }
        }
    }
}


//            if(root.val == p) {
//                    pPassed = true;
//                    pLevel = level;
////                System.out.println("P");
//                    }
//                    if(root.val == q) {
//                    qPassed = true;
//                    qLevel = level;
////                System.out.println("Q");
//                    }
//
//            if(root.val == q || root.val == p) {
//                if((pPassed && !qPassed ) || (!pPassed && qPassed )){
//                    System.out.println("R");
//                }
//            }

//System.out.print(root.val + "(" + level + ")" + " ");
//            if(pPassed && qPassed && ancestor == null && pLevel > level && qLevel > level) {
//                ancestor = root;
//            }

class LowestCommonAncestorTest {
    public static void main(String[] args){
//        Integer[] nodes = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
//        TreeNode root = new TreeNode();
//        root = root.prepareTree(nodes);
//        TreeNode p = new TreeNode(5);
//        TreeNode q = new TreeNode(1);

        Integer[] nodes = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = new TreeNode();
        root = root.prepareTree(nodes);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);

        LowestCommonAncestor btpt = new LowestCommonAncestor();
        TreeNode result = btpt.lowestCommonAncestor(root, p, q);
        if(result != null){
            System.out.println();
            System.out.println(result.val);
        }

    }
}