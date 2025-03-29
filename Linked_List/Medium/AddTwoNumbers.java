public class AddTwoNumbers {
    public ListNode add(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        int carry = 0;
        while (head1 != null || head2 != null) {
            int sum = 0;
            if (head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            sum+=carry;
            ListNode newNode=new ListNode(sum%10);
            curr.next=newNode;
            curr=newNode;
            carry=sum/10;
        }
        if(carry>0){
            ListNode newNode=new ListNode(carry);
            curr.next=newNode;
            curr=newNode;
        }
        return dummyHead.next;
    }
}
