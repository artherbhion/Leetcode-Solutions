public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
                }
        }
        if(fast==null || fast.next==null){
            return null;
        }
                while(slow!=head){
                    slow=slow.next;
                    head=head.next;
                    if(slow==head){
                        return slow;
                    }
    }return slow;
            }            
}