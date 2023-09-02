package leetcode.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LC933 {
    public static void main(String[] args){
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));     // requests = [1], range is [-2999,1], return 1
        System.out.println(recentCounter.ping(100));   // requests = [1, 100], range is [-2900,100], return 2
        System.out.println(recentCounter.ping(3001));  // requests = [1, 100, 3001], range is [1,3001], return 3
        System.out.println(recentCounter.ping(3002));  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
    }
}

class RecentCounter {

    Queue<Integer> queue = new LinkedList<>();
    int max = 0;
    
    public RecentCounter() {
        queue = new LinkedList<>();
        max = 0;
    }
    
    public int ping(int t) {
        max = t;
        int min = max - 3000;
        queue.add(t);
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()){
            int n = iterator.next();
            if(min <= n && max >= n) break;
            iterator.remove();
        }
        return queue.size();
    }
}