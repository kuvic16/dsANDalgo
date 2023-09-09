package leetcode.linked_list;

import leetcode.common.ListNode;

public class LC328 {
    public ListNode oddEvenList(ListNode head) {
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
