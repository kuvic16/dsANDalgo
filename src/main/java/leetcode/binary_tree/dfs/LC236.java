package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC236 {
    public TreeNode t = null;
    public TreeNode tp = null;
    public TreeNode tq = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        tp = p;
        tq = q;
        traverse(root, "");
        return root;
    }

    public void traverse(TreeNode node, String rail){
        if(node == null) return;

        if(!rail.isEmpty()) rail += ",";
        rail += node.val;

        System.out.println(node.val + ": " + rail);
        traverse(node.left, rail);
        traverse(node.right, rail);

//        if(compare(node, tp)) {
//            System.out.println("P found");
//
//        }
    }

    public boolean compare(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 == null || n2 == null) {
            return false;
        }

        if (n1.val != n2.val) {
            return false;
        }

        boolean left = compare(n1.left, n2.left);
        boolean right = compare(n1.right, n2.right);

        return left && right;
    }
}

class LC236Test{
    public static void main(String[] args){
        LC236 lc236 = new LC236();
        TreeNode root = new TreeNode();
        TreeNode p = new TreeNode();
        TreeNode q = new TreeNode();

        root = root.prepareTree(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
        p = p.prepareTree(new Integer[]{5,6,2,null,null,7,4});
        q = q.prepareTree(new Integer[]{1,0,8});


        TreeNode result = lc236.lowestCommonAncestor(root, p, q);
        root.print(root);
    }
}