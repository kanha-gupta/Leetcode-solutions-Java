public class No237_DeleteNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void deleteNode(ListNode node) {
        //since we dont know previous nodes. the node we have to delete
        //will be changed to node.next val.
        node.val = node.next.val;
        //after this we connect the next node of deleted node to its next node
        node.next = node.next.next;
    }
}
