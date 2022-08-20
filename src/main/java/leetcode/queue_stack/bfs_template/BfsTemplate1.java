package leetcode.queue_stack.bfs_template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTemplate1 {
    static class Node {
        int data;
        List<Node> neigbours;

        Node(int d, int[] ngs) {
            data = d;
            neigbours = new ArrayList<Node>();
            for(int n : ngs){
                int[] nn = {};
                neigbours.add(new Node(n, nn));
            }
        }
    }

    int BFS(Node root, Node target) {
        Queue<Node> queue;
        int step = 0;
        queue = new LinkedList<Node>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; ++i){
                Node cur = queue.peek();
                if(cur.data == target.data) return step;
                for(Node next : cur.neigbours){
                    queue.offer(next);
                }
                queue.poll();
            }
            step = step + 1;
        }
        return -1;
    }
}

class BfsTemplate1Test {
    public static void main(String[] args){
        BfsTemplate1.Node node = new BfsTemplate1.Node(1, new int[]{2, 3, 4});
        System.out.println("done");
    }
}
