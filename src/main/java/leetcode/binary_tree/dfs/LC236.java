package leetcode.binary_tree.dfs;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class LC236 {
    public TreeNode t = null;
    public TreeNode tp = null;
    public TreeNode tq = null;
    public boolean pfound = false;
    public boolean qfound = false;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        tp = p;
        tq = q;
        traverse(root, "");
        return t;
    }

    public void traverse(TreeNode node, String rail){
        if(node == null) return;
        if(pfound && qfound) return;

        traverse(node.left, rail);
        traverse(node.right, rail);
        if(pfound && qfound) return;
        System.out.println(node.val + ": " + rail);
        pfound = false; qfound = false;
        findChild(node);
        if(pfound && qfound) {
            t = node;
        }

    }

    public void findChild(TreeNode node){
        if(node == null) return;
        if(compare(node, tp)) pfound = true;
        if(compare(node, tq)) qfound = true;
        findChild(node.left);
        findChild(node.right);
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

//        root = root.prepareTree(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
//        p = p.prepareTree(new Integer[]{5,6,2,null,null,7,4});
//        q = q.prepareTree(new Integer[]{4});


        TreeNode result = lc236.lowestCommonAncestor(root, p, q);
        result.print(result);
    }
}