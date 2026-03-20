package lc;

import leetcode.common.ListNode;

import java.util.Stack;

public class LC234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while(!stack.isEmpty()){
            if(stack.size() == 1) return true;
            if(stack.pop() != stack.remove(0)) return false;
        }
        return true;
    }
}

class LC234Test {
    public static void main(String[] args){
        LC234 lc234 = new LC234();
        ListNode listNode = new ListNode(new int[]{1,2,1, 2,1});
        boolean result = lc234.isPalindrome(listNode);
        System.out.println(result);
    }
}
