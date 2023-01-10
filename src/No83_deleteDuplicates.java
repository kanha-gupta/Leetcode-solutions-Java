import java.util.List;

public class No83_deleteDuplicates {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp=head; //make changes in head then return temp as its equivalent
        while (head.next !=null){
            if (head.val == head.next.val) {
                head.next=head.next.next;
            }
            else{
                head=head.next;
            }
        }
        return temp;
    }
}
