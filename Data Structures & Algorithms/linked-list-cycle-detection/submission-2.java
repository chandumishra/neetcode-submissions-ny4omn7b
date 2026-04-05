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
        Set<ListNode> set=new HashSet<>();
        ListNode roamer = head;
        while(roamer!=null){
          if(set.contains(roamer)){
            return true;
          }
          set.add(roamer);
          roamer=roamer.next;
        }
        return false;
    }
}
