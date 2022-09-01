package leetcode.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    public Node(int val) { this.val = val; }
    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(int val, Node left, Node right, Node next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }

    public Node prepareTree(Integer[] nodes){
        Queue<Node> parentQueue = new LinkedList<Node>();
        Node parent = null; int i=1;
        Node root = null;
        for(Integer node : nodes){
            if(parent == null){
                parent = new Node(node);
                root = parent;
                parentQueue.offer(parent);
                continue;
            }
            if(i==1){
                if(node != null) {
                    Node curr = new Node(node);
                    parent.left = curr;
                    parentQueue.offer(curr);
                }
                i += 1;
            }else if(i == 2){
                if(node != null) {
                    Node curr = new Node(node);
                    parent.right = curr;
                    parentQueue.offer(curr);
                }
                i = 1;
                parentQueue.poll();
                if(!parentQueue.isEmpty()) {
                    parent = parentQueue.peek();
                }
            }
        }
        return root;
    }
}
