package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Shaiful Islam Palash | kuvic16@gmail.com
 * @CreatedAt: 8/18/2022
 */
public class MyCircularQueue {

    private List<Integer> data;
    private int p_start;
    private int p_end;
    private int max_length;

    public MyCircularQueue(int k){
        data = new ArrayList<Integer>();
        for(int i=0; i<k; i++){
            data.add(null);
        }
        max_length = k;
        p_start = 0;
        p_end = 0;
    }

    public boolean enQueue(int value) {
        if(data.get(p_end) == null) {
            data.set(p_end, value);
            if(p_start < max_length)
                p_end += 1;
            else p_end = 0;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        return false;
    }

    public int Front() {
        return 0;
    }

    public int Rear() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }

    public void print() {
        System.out.println("p_start: " + p_start);
        System.out.println("p_end: " + p_end);
        for(int i=0; i<data.size(); i++){
            System.out.print(data.get(i) + " ");
        }
    }
}

class Main{
    public static void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(3);
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(30);
        q.print();
    }
}

