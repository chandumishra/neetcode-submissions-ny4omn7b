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
    public boolean hasCycle(ListNode head) {
        ListNode fastroamer=head;
        ListNode slowroamer=head;
        while(fastroamer != null && fastroamer.next != null){
          fastroamer=fastroamer.next.next;
          slowroamer=slowroamer.next;
          
          if(slowroamer==fastroamer){
            return true;
          }
        }
        return false;
    }
}
