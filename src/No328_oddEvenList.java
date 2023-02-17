import java.util.List;

public class No328_oddEvenList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        //approach would be to make 2 list of one odd & one even, then merge them together
        //with evenHead variable
        if(head==null){
            return null;
        }
        ListNode odd=head;
        ListNode even= head.next;
        ListNode evenHead= head.next;
        while (even != null && even.next != null){
            odd.next=odd.next.next; //hopping to next odd node
            even.next=even.next.next; //hopping to next even node

            odd=odd.next; //get to next odd node & reiterate
            even=even.next; //get to next even node & reiterate
        }
        odd.next= evenHead; //finally merge both the nodes
        return head;
    }
}
