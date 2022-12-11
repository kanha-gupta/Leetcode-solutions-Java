public class No160_getIntersectNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        if(headA==headB){
            return headA;
        }
            ListNode a=headA;
            ListNode b=headB;
            int len1=1;
            int len2=1;
            //counting the length
            while (a.next!=null){
                len1++;
                a=a.next;
            }
            while (b.next!=null){
                len2++;
                b=b.next;
            }
            //after counting the length we will move pointers to make length same
            a=headA;
            b=headB;
            int difference;
                if(len1>len2){
                    difference=len1-len2;
                    for (int i = 0; i < difference; i++) {
                        a=a.next;
                    }
                }
                if(len2>len1){
                   difference=len2-len1;
                    for (int i = 0; i < difference; i++) {
                        b=b.next;
                    }
                }
               while (a!=b){
                   a=a.next;
                   b=b.next;
               }
            return a;
        }
    }


