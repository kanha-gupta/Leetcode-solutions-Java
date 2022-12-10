import java.util.List;

public class No876_MiddleOfLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //using pointer approach
    public ListNode middleNode(ListNode head) {
    //we will run two pointers from head. One will hop 2 nodes & another will hop 1 node. so when the Fast pointer reaches the end,
    //slow pointer will reach the mid of linkedlist & we return the list from their.

    ListNode a=head; //this will hop 1 node
    ListNode b=head; //this will hop 2 nodes
    while (b!=null && b.next!=null){
    a=a.next;
    b=b.next.next;
    }
    return a;
    }
}
