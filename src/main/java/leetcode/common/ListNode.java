package leetcode.common;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    public void print(){
        ListNode result = this;
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public ListNode(int[] nums){
        ListNode prev = null;
        for(int i=nums.length-1; i>=0; i--){
            ListNode listNode = new ListNode(nums[i]);
            if(prev != null) listNode.next = prev;
            prev = listNode;
        }
        this.val = prev.val;
        this.next = prev.next;
    }
}
