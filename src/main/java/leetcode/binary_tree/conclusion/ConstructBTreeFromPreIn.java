package leetcode.binary_tree.conclusion;

import leetcode.binary_tree.TraverseTree.TreeNode;

public class ConstructBTreeFromPreIn {

    TreeNode root = null;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        buildBTree(inorder, preorder, root, true, 0);
        return root;
    }

    private void buildBTree(int[] list, int[] preorder, TreeNode parent, boolean isLeft, int preindex){
        int curr[] = getCurr(list, preorder, preindex);
        if(curr[0] == -1) return;

        TreeNode node = new TreeNode(curr[1]);
        if(parent != null){
            if(isLeft) parent.left = node;
            else parent.right = node;
        }else {
            root = node;
        }

        if(list.length == 1) {
            return;
        }


        int left[] = new int[curr[0]];
        for(int i=0; i<curr[0]; i++){
            left[i] = list[i];
            //System.out.print(list[i] + " ");
        }
        //System.out.println();
        buildBTree(left, preorder, node,true, preindex+1);

        if(list.length -1 - curr[0] > 0) {
            int right[] = new int[list.length - 1 - curr[0]];
            int j=0;
            for(int i=curr[0]+1; i<list.length; i++){
                right[j++] = list[i];
                //System.out.print(list[i] + " ");
            }
            //System.out.println();
            buildBTree(right, preorder, node,false, preindex+1);
        }
    }

    private int[] getCurr(int[] list, int[] preorder, int preindex){
        int[] curr = new int[2];
        if(list.length == 1) {
            curr[0] = 0;
            curr[1] = list[0];
            return curr;
        }

        for(int i=preindex; i<preorder.length; i++){
            for(int j=0; j<list.length; j++){
                if(preorder[i] == list[j]) {
                    curr[0] = j;
                    curr[1] = list[j];
                    return curr;
                }
            }
        }
        curr[0] = -1;
        curr[1] = -1;
        return curr;
    }

}

class ConstructBTreeFromPreInTest{
    public static void main(String[] args) {
        ConstructBTreeFromPreIn c = new ConstructBTreeFromPreIn();

        int[] inorder = new int[]{9,3,15,20,7};
        int[] preorder = new int[]{3,9,20,15,7};

        //int[] inorder = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        //int[] postorder = new int[]{8, 4, 5, 2, 6, 7, 3, 1};

//        int[] inorder = new int[]{-1};
//        int[] postorder = new int[]{-1};

        c.buildTree(preorder, inorder);
    }
}
