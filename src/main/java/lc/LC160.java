package lc;

import leetcode.common.ListNode;

public class LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null){

            while (headB != null){
            if(headA.val == headB.val) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return new ListNode(0);
    }
}

class LC160Test {
    public static void main(String[] args){
        LC160 lc160 = new LC160();
        ListNode headA = new ListNode(new int[]{4,1,8,4,5});
        ListNode headB = new ListNode(new int[]{5,6,1,8,4,5});
        ListNode listNodeOutput = lc160.getIntersectionNode(headA, headB);
        listNodeOutput.print();
    }
}
