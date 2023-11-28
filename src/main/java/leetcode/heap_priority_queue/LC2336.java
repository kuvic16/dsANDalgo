package leetcode.heap_priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LC2336 {

}

class SmallestInfiniteSet{
    int start = 0;
    int end = 0;
    Queue<Integer> aQueue = new PriorityQueue<>();

    public SmallestInfiniteSet() {
        start = 1;
        end = Integer.MAX_VALUE;
        aQueue = new PriorityQueue<>();
    }

    public int popSmallest() {
        if(aQueue.isEmpty()) return start++;
        return aQueue.poll();
    }

    public void addBack(int num) {
        if(num >= start && num <= end) return;
        if(aQueue.contains(num)) return;
        aQueue.offer(num);
    }
}
