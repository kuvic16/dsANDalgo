package leetcode.linked_list;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.ListNode;

public class LC2095 {
    public ListNode deleteMiddleX1(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode tmp = head;
        while(tmp != null){
            list.add(new ListNode(tmp.val));
            tmp = tmp.next;
        }

        if(list.size() == 1) return null;
        int m = list.size()/2;

        ListNode prev = null;
        for(int i=list.size()-1; i>=0; i--){
            if(m != i) {
                head = new ListNode(list.get(i).val);
                if (prev != null) head.next = prev;
                prev = head;
            }
        }
        
        return head;
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode tmp = head;
        while(slow != null){
            slow = slow.next;
            fast = fast.next != null && fast.next.next != null ? fast.next.next : null;
            if(fast == null || fast.next == null){
                tmp.next = slow != null ? slow.next : null;
                break;
            }
            tmp = slow;
        }
        return head;
    }
}

class LC2095Test{
    public static void main(String[] args){
        LC2095 lc2095 = new LC2095();
       ListNode a = new ListNode(6);
       ListNode b = new ListNode(2, a);
       ListNode c = new ListNode(1, b);
       ListNode d = new ListNode(7, c);
       ListNode e = new ListNode(4, d);
       ListNode f = new ListNode(3, e);
       ListNode g = new ListNode(1, f);
       ListNode result = lc2095.deleteMiddle(g);

//        ListNode a = new ListNode(4);
//        ListNode b = new ListNode(3, a);
//        ListNode c = new ListNode(2, b);
//        ListNode d = new ListNode(1, c);
//        ListNode result = lc2095.deleteMiddle(d);

//        ListNode a = new ListNode(1);
//        ListNode b = new ListNode(2, a);
//        ListNode result = lc2095.deleteMiddle(b);

        // ListNode a = new ListNode(1);
        // ListNode result = lc2095.deleteMiddle(a);
        result.print();

        // while(result != null){
        //     System.out.print(result.val + " ");
        //     result = result.next;
        // }

    }
}
