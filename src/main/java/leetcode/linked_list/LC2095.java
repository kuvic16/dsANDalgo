package leetcode.linked_list;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.ListNode;

public class LC2095 {
    public ListNode deleteMiddle(ListNode head) {
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
}

class LC2095Test{
    public static void main(String[] args){
        LC2095 lc2095 = new LC2095();
//        ListNode a = new ListNode(6);
//        ListNode b = new ListNode(2, a);
//        ListNode c = new ListNode(1, b);
//        ListNode d = new ListNode(7, c);
//        ListNode e = new ListNode(4, d);
//        ListNode f = new ListNode(3, e);
//        ListNode g = new ListNode(1, f);
//        ListNode result = lc2095.deleteMiddle(g);

        ListNode a = new ListNode(4);
        ListNode b = new ListNode(3, a);
        ListNode c = new ListNode(2, b);
        ListNode d = new ListNode(1, c);
        ListNode result = lc2095.deleteMiddle(d);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}
