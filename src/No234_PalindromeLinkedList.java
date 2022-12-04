import java.util.List;
import java.util.Stack;

public class No234_PalindromeLinkedList {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
//Very slow approach right now,Needs optimisation
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
    ListNode ptr=head;
        while (ptr!= null){
            stack.push(ptr.val);
            ptr=ptr.next;
            //this will fill the stack
        }

        while (head!=null){
            int i=stack.pop();

            if(i!=head.val){
                return false;
            }
            head=head.next;
        }
     return true;
    }

}
