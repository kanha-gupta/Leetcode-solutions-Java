import java.util.HashSet;

public class No141_LinkedListCycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //code works but requires time optimisation
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        HashSet<ListNode> hashSet=new HashSet<>();
       while (head!=null){
           if(hashSet.contains(head)){
               return true;
           }
           hashSet.add(head);
           head=head.next;
       }
        return false;
    }

}
