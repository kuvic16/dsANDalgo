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

        List<List<Node>> levelList = new ArrayList<List<Node>>();
        List<Node> neighbours = new ArrayList<Node>();
        neighbours.add(root);
        levelList.add(neighbours);

        Node curr = null;
        neighbours = new ArrayList<Node>();
        while(!queue.isEmpty()){
            curr = queue.peek();
            if(curr.left != null) {
                neighbours.add(curr.left);
            }
            if(curr.right != null) {
                neighbours.add(curr.right);
            }
            queue.poll();

            if(queue.isEmpty() && neighbours.size() > 0){
                for(Node node : neighbours){
                    queue.offer(node);
                }
                levelList.add(neighbours);
                neighbours = new ArrayList<Node>();
            }
        }

        for(List<Node> level : levelList){
            for(int i=0; i<level.size(); i++){
                if(i+1 < level.size()){
                    level.get(i).next = level.get(i+1);
                }
            }
        }
        return root;
    }


}


class TreeNextRightTreeNextRightTwoTest {
    public static void main(String[] args){
        Integer[] nodes = new Integer[]{1,2,3,4,5,null,7};
        Node root = new Node ();
        root = root.prepareTree(nodes);

        TreeNextRightTwo btpt = new TreeNextRightTwo();
        btpt.connect(root);
        //btpt.levelOrder(node5);


    }
}