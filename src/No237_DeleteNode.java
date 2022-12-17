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

        node.next = node.next.next;
        //in this way node.next is skipped & instead the node we have to delete has value changed & its next pointer connected to node.next.next

    }
}
