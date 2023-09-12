package leetcode.linked_list;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LC2130 {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int i=0,n=list.size(), max = 0;
        for(i=0; i<(n/2); i++){
            int sum = list.get(i) + list.get(n-1-i);
            if(sum > max) max = sum;
        }
        return max;
    }
}

class LC2130Test{
    public static void main(String[] args){
        LC2130 lc2130 = new LC2130();
        ListNode sample = new ListNode(new int[]{5,4,2,1});
//        ListNode sample = new ListNode(new int[]{4,2,2,3});
//        ListNode sample = new ListNode(new int[]{1,100000});
        System.out.println(lc2130.pairSum(sample));
    }
}
