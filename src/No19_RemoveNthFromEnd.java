public class No19_RemoveNthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //I used fast & slow pointer approach in which fast pointer is moved n+1 places forward
        //to maintain a gap between two pointers. then move both of them together
        ListNode start=new ListNode(0);
        ListNode slow= start;
        ListNode fast=start;
        slow.next=head;

        for (int i = 1; i <=n+1; i++) {
            fast=fast.next;
        } // this maintains the gap

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        } //this moves both together until slow pointer reaches the node it needs to be skipped

        slow.next=slow.next.next;

        return start.next;
    }

}
