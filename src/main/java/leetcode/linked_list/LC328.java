package leetcode.linked_list;

import leetcode.common.ListNode;

public class LC328 {
    public ListNode oddEvenList(ListNode head) {
        if(head.next == null) return head;

        ListNode tmp = head;
        //tmp = tmp.next;
        while(tmp != null){
            ListNode tmp1 = tmp.next;
            if(tmp1 != null && tmp1.next != null){
                tmp.next = tmp1.next;
                tmp1.next = tmp.next.next;
                tmp.next.next = tmp1;
            }
            tmp = tmp.next;
        }
        return head;
    }
}

class LC328Test {
    public static void main(String[] args){
        LC328 lc328 = new LC328();
        ListNode sample = new ListNode(new int[]{1,2,3,4,5});
        ListNode result = lc328.oddEvenList(sample);
        result.print();
    }
}

//1,2,3,4,5
//1,3,2,4,5
//1,3,4,2,5
//1,3,4,5,2
