package leetcode.queue_stack.circular_queue;

public class MyCircularQueueLeet {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    public MyCircularQueueLeet(int k) {
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull() == true) {
            return false;
        }

        if (isEmpty() == true) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    public boolean deQueue(){
        if(isEmpty() == true) {
            return false;
        }

        if(head == tail){
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    public int Front(){
        if(isEmpty() == true) {
            return -1;
        }
        return data[head];
    }

    public int Rear(){
        if(isEmpty() == true){
            return -1;
        }
        return data[tail];
    }

    public boolean isEmpty(){
        return head == -1;
    }

    public boolean isFull(){
        return ((tail + 1) % size) == head;
    }
}

class MyCircularQueueLeetTest{
    public static void main(String[] args) {
        MyCircularQueueLeet mq = new MyCircularQueueLeet(2);
        System.out.println(mq.enQueue(1));
        System.out.println(mq.enQueue(2));
        System.out.println(mq.deQueue());
        System.out.println(mq.enQueue(3));
        System.out.println(mq.deQueue());
        System.out.println(mq.enQueue(3));
        System.out.println(mq.deQueue());
        System.out.println(mq.enQueue(3));
        System.out.println(mq.deQueue());
        System.out.println(mq.Front());
    }
}
