package leetcode.linked_list;

import leetcode.common.ListNode;

public class LC206 {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while(head != null){
            ListNode listNode = new ListNode(head.val);
            if(reverse != null) listNode.next = reverse;
            reverse = listNode;
            head = head.next;
        }
        return reverse;
    }
}

class LC206Test{
    public static void main(String[] args){
        LC206 lc206 = new LC206();
//        ListNode sample = new ListNode(new int[]{1,2,3,4,5});
//        ListNode sample = new ListNode(new int[]{1,2});
//        ListNode sample = new ListNode(new int[]{1});
        ListNode sample = new ListNode(null);
        ListNode result = lc206.reverseList(sample);
        result.print();
    }
}
