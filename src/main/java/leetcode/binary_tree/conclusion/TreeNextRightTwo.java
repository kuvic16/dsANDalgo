package leetcode.binary_tree.conclusion;

import leetcode.binary_tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNextRightTwo {

    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null) return null;

        queue.offer(root);
        Node curr = root;
        List<Node> neighbours = new ArrayList<Node>();
        neighbours.add(root);

        while(!queue.isEmpty()){
            curr = queue.peek();
            if(curr.left != null) {
                neighbours.add(curr.left);
                queue.offer(curr.left);
            }
            if(curr.right != null) {
                neighbours.add(curr.right);
                queue.offer(curr.right);
            }
            queue.poll();
        }

        int counter = 0; double nextLevel = 1;
        for(int i=0; i<neighbours.size(); i++){
            Node node = neighbours.get(i);
            counter += 1;
            if(nextLevel > 1 && counter < nextLevel){
                if(i < neighbours.size() - 1){
                    node.next = neighbours.get(i + 1);
                }
            }
            if(counter == nextLevel){
                counter = 0;
                nextLevel = nextLevel * 2;
            }
        }
        return root;
    }


}


class TreeNextRightTreeNextRightTwoTest {
    public static void main(String[] args){
        Integer[] nodes = new Integer[]{1,2,3,4,5,6,7};
        Node root = new Node ();
        root = root.prepareTree(nodes);

        TreeNextRight btpt = new TreeNextRight();
        btpt.connect(root);
        //btpt.levelOrder(node5);


    }
}