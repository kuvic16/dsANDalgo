package leetcode.queue_stack.bfs_template;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsTemplate1 {
    static class Node {
        char data;
        List<Node> neigbours;

        Node(char d, List<Node> _neigbours) {
            data = d;
            neigbours = _neigbours;
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
        char[][] grid = new char[4][5];
        grid[0] = new char[]{'1','1','1','1','0'};
        grid[1] = new char[]{'1','1','0','1','0'};
        grid[2] = new char[]{'1','1','0','0','0'};
        grid[3] = new char[]{'0','0','0','0','0'};

        System.out.println(grid.length);
        for (int i=grid.length - 1; i >=0; i--){
            for(int j=grid[i].length - 1; j >= 0; j--){
                List<BfsTemplate1.Node> neigbours = new ArrayList<BfsTemplate1.Node>();
                if(j+1 <= grid[i].length - 1){
                    neigbours.add(new BfsTemplate1.Node(grid[i][j+1], null));
                }
            }
        }

        //BfsTemplate1.Node node = new BfsTemplate1.Node('1', null);
        System.out.println("done");
    }
}
