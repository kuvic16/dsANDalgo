package lc;

import leetcode.binary_tree.TraverseTree.TreeNode;
import leetcode.common.ListNode;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LC141 {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new LinkedHashMap<>();
        while(head != null){
            if(map.containsKey(head)) return true;
            map.put(head, 1);
            head = head.next;
        }
        return false;
    }
}

class LC141Test {
    public static void main(String[] args) {
        LC141 lc141 = new LC141();
        int[] data = {3,2,0,-4};
        ListNode listNode = new ListNode(data);
        boolean result = lc141.hasCycle(listNode);
        System.out.println(result);
    }
}