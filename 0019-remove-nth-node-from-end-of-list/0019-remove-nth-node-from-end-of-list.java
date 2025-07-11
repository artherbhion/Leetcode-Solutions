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
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        if(n==c)return head.next;
        System.out.print(c);
        ListNode temp1=head;
        int i=1;
        while(temp1!=null){
            if(i==c-n){
                temp1.next=temp1.next.next;
            }
            temp1=temp1.next;
            i++;
        }
        return head;
    }
}