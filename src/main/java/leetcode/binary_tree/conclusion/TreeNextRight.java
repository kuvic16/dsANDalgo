package leetcode.binary_tree.conclusion;

import leetcode.binary_tree.Node;
import leetcode.binary_tree.TraverseTree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNextRight {

    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null) return null;

        queue.offer(root);
        Node curr = root;
        while(!queue.isEmpty()){
            List<Node> neighbours = new ArrayList<Node>();
            if(curr.left != null) {
                neighbours.add(curr.left);
                queue.offer(curr.left);
            }
            if(curr.right != null) neighbours.add(curr.right);

            Node prevnext = null;
            for(int i=neighbours.size()-1; i>=0; i--){
                Node node = neighbours.get(i);
                node.next = prevnext;

                prevnext = node;
            }
        }

        traverse(root, 1, null);
        return null;
    }


}


class TreeNextRightTest {
    public static void main(String[] args){
        Integer[] nodes = new Integer[]{1,2,3,4,5,6,7};
        Node root = new Node ();
        root = root.prepareTree(nodes);

        TreeNextRight btpt = new TreeNextRight();
        btpt.connect(root);
        //btpt.levelOrder(node5);


    }
}