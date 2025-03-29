public class RemoveDuplicatesII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummyHead = new ListNode(-10);
        ListNode prev = dummyHead;
        ListNode curr = head;
        dummyHead.next = head;
        while (curr!= null) {
            if (curr.next!=null&&curr.val == curr.next.val) {
                int val=curr.val;
                while(curr!=null&&curr.val==val){
                    curr=curr.next;
                }
                prev.next=curr;
            } else {
                prev=prev.next;
                curr=curr.next;
            }
        }
        return dummyHead.next;
    }
}
