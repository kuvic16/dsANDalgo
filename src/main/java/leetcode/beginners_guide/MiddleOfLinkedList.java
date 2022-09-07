package leetcode.beginners_guide;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<ListNode>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        return list.get(list.size()/2);
    }
}

class MiddleOfLinkedListTest{
    public static void main(String[] args){

    }
}