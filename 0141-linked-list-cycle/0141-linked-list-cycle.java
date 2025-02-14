/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         ext = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head==null){
        return false;
       }
       ListNode s=head;
       ListNode f=head;
       while(f!=null &&f.next!=null){
        if(f.next==s){
            return true;
        }
        f=f.next.next;
        s=s.next;
       }
       return false;
    }
}