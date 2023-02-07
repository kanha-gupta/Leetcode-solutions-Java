public class No24_swapPairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //iterative approach
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr= head.next.next; //skipping two nodes
        ListNode prev=head; //prev node as head
        head=head.next; //skipped one node
        head.next=prev;
        while (curr!=null && curr.next!=null){ //iterative approach begins
            prev.next= curr.next;
            prev = curr;
            ListNode next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }
}
