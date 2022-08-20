package leetcode.queue_stack.circular_queue;

import java.util.LinkedList;
import java.util.Queue;

public class BuildInCircularQueue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println("The first element is: " + q.peek());
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        q.poll();
        System.out.println("The first element is: " + q.peek());
        System.out.println("The size is: " + q.size());
    }
}
