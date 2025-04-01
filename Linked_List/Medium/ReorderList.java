import static java.util.Collections.reverse;

public class ReorderList {
    public void reorderList(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);
        ListNode temp1=head;
        ListNode temp2=head2;
        while(temp2!=null){
           ListNode n1=temp1.next;
           ListNode n2=temp2.next;
           temp1.next=temp2;
           temp2.next=n1;
           temp1=n1;
           temp2=n2;
        }
    }
    ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
