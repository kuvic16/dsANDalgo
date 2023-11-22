package leetcode.random;

import leetcode.common.ListNode;

public class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode s = new ListNode();
        ListNode r = s;
        int reminder = 0, sum = 0;
        while(l1 != null || l2 != null){
            sum = reminder;
            if(l1 != null) sum += l1.val;
            if(l2 != null) sum += l2.val;
            if(sum > 9) {
                reminder = sum/10;
                sum = sum % 10;
            }else reminder = 0;
            s.val = sum;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            if(l1 != null || l2 != null) {
                s.next = new ListNode();
                s = s.next;
            }

        }

        if(reminder > 0) {
            s.next = new ListNode();
            s = s.next;
            s.val = reminder;
        }
        return r;
    }

    public ListNode nextNode(ListNode s, int val){
        s.val = val;
        s.next = new ListNode();
        s = s.next;
        return s;
    }

//    public ListNode nextNode(ListNode s, int val){
//        s.val = val;
//        s = s.next;
//        return s;
//    }

    public static void main(String[] args){
//        ListNode a = new ListNode(new int[]{2,4,3});
//        ListNode b = new ListNode(new int[]{5,6,4});

//        ListNode a = new ListNode(new int[]{0});
//        ListNode b = new ListNode(new int[]{0});

        ListNode a = new ListNode(new int[]{9,9,9,9,9,9,9});
        ListNode b = new ListNode(new int[]{9,9,9,9});

        LC2 lc2 = new LC2();
        ListNode s = lc2.addTwoNumbers(a, b);
        s.print();
    }
}
