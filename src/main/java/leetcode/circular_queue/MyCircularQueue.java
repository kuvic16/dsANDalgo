package leetcode.circular_queue;

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
        if(isFull()) {
            return false;
        }

        if(data.get(p_end) == null) {
            data.set(p_end, value);
            if(p_end < max_length - 1)
                p_end += 1;
            else p_end = 0;
            return true;
        }
        return false;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        if(data.get(p_start) != null) {
            data.set(p_start, null);
            if(p_start < max_length -1)
                p_start += 1;
            else p_start = 0;

            if(isEmpty()){
                p_start = p_end = 0;
            }
            return true;
        }
        return false;
    }

    public int Front() {
        return data.get(p_start) == null ? -1 : data.get(p_start);
    }

    public int Rear() {
        Integer result = p_end == 0 ? data.get(max_length - 1) : data.get(p_end - 1);
        return result == null ? -1 : result;
    }

    public boolean isEmpty() {
        for(int i=0; i<data.size(); i++){
            if(data.get(i) != null) return false;
        }
        return true;
    }

    public boolean isFull() {
        for(int i=0; i<data.size(); i++){
            if(data.get(i) == null) return false;
        }
        return true;
    }

    public void print() {
        System.out.print("p_start: " + p_start + " -> ");
        System.out.print("p_end: " + p_end + " -> ");
        for(int i=0; i<data.size(); i++){
            System.out.print(data.get(i) + " ");
        }
        System.out.println();
    }
}

class MyCircularQueueTest{
    public static void main(String[] args) {
//        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
//        myCircularQueue.print();
//        myCircularQueue.enQueue(1); // return True
//        myCircularQueue.print();
//        myCircularQueue.enQueue(2); // return True
//        myCircularQueue.print();
//        myCircularQueue.enQueue(3); // return True
//        myCircularQueue.print();
//        myCircularQueue.enQueue(4); // return False
//        myCircularQueue.print();
//        System.out.println("");
//        System.out.println(myCircularQueue.Rear());     // return 3
//        System.out.println(myCircularQueue.isFull());   // return True
//        System.out.println(myCircularQueue.deQueue());  // return True
//        myCircularQueue.print();
//        System.out.println(myCircularQueue.enQueue(4)); // return True
//        myCircularQueue.print();
//        System.out.println("");
//        System.out.println(myCircularQueue.Rear());     // return 4


        //["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]
        //[[6],[6],[],[],[],[5],[],[],[],[],[],[]]
//        MyCircularQueue mq = new MyCircularQueue(6);
//        mq.print();
//        System.out.println(mq.enQueue(6));
//        mq.print();
//        System.out.println(mq.Rear());
//        System.out.println(mq.Rear());
//        System.out.println(mq.deQueue());
//        mq.print();
//        System.out.println(mq.enQueue(5));
//        System.out.println(mq.Rear());
//        System.out.println(mq.deQueue());
//        mq.print();
//        System.out.println(mq.Front());
//        System.out.println(mq.deQueue());
//        System.out.println(mq.deQueue());
//        System.out.println(mq.deQueue());
//        System.out.println();


        //["MyCircularQueue","enQueue","enQueue","deQueue","enQueue","deQueue","enQueue","deQueue","enQueue","deQueue", "Front"]
//[[2],[1],[2],[],[3],[],[3],[],[3],[],[]]
        MyCircularQueue mq = new MyCircularQueue(2);
        System.out.println(mq.enQueue(1));
        System.out.println(mq.enQueue(2));
        mq.print();
        System.out.println(mq.deQueue());
        mq.print();
        System.out.println(mq.enQueue(3));
        mq.print();
        System.out.println(mq.deQueue());
        mq.print();
        System.out.println(mq.enQueue(3));
        mq.print();
        System.out.println(mq.deQueue());
        mq.print();
        System.out.println(mq.enQueue(3));
        mq.print();
        System.out.println(mq.deQueue());
        mq.print();
        System.out.println(mq.Front());



    }
}

