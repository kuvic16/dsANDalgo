package leetcode.linked_list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import leetcode.common.ListNode;

public class LC328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();

        int i =1;
        while(head != null){
            if(i++%2==0) even.add(head.val);
            else odd.add(head.val);
            head = head.next;
        } 

        
        head = null;
        while(!even.isEmpty()){        
            ListNode listNode = new ListNode(even.pop());
            if(head != null) listNode.next = head;
            head = listNode;
        }

        while(!odd.isEmpty()){        
            ListNode listNode = new ListNode(odd.pop());
            listNode.next = head;
            head = listNode;
        }

        return head;
    }
}

class LC328Test {
    public static void main(String[] args){
        LC328 lc328 = new LC328();
        //  ListNode sample = new ListNode(new int[]{1,2,3,4,5});
        //ListNode sample = new ListNode(new int[]{2,1,3,5,6,4,7});
        //  ListNode sample = new ListNode(new int[]{1,2});
         ListNode sample = new ListNode(new int[]{1});
        ListNode result = lc328.oddEvenList(sample);
        result.print();
    }
}

//1,2,3,4,5
//1,3,2,4,5
//1,3,4,2,5
//1,3,4,5,2
