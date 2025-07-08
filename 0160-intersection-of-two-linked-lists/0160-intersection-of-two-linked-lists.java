/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) { 
        ListNode sa=a;
        ListNode sb=b;
    while( a != b){
    	 a=(a==null)?sb:a.next;
    	 b=(b==null)?sa:b.next;
        }    
    return a;
}
}