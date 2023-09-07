package leetcode.linked_list;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.ListNode;

public class LC2095 {
    public ListNode deleteMiddle(ListNode head) {
        int n = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            n += 1;
        }

        int m = n/2;
        int i = 0;
        while(head != null){
            head = head.next;
            i += 1;
            if(i == m-1)
        }
        
        return null;
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
        System.out.println(result.val);
    }
}
