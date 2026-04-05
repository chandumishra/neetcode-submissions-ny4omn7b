/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       List<ListNode> list=new ArrayList<>();
       ListNode curr=head;
       while(curr!=null){
        list.add(curr);
        curr=curr.next;
       }
       int size=list.size()-1;
       int i=0;
       int index = list.size() - n;
        if (index == 0) {
            return head.next;
        }
        ListNode prev = list.get(index - 1);
        ListNode next = (index + 1 < list.size()) ? list.get(index + 1) : null;

        prev.next = next;

        return head;
    }
}
