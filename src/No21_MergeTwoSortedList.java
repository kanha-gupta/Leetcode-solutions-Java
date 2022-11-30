public class No21_MergeTwoSortedList {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode result=new ListNode(-1); //the value doesnt matter because we will return result.next
         ListNode tail=result;
         while (list1!=null && list2!=null){
             if(list1.val<= list2.val){
                 tail.next=list1;
                 list1=list1.next;//this line is used to move the pointer forward by 1 node
             }
             else{
                 tail.next=list2;
                 list2=list2.next;
             }
            tail=tail.next; //this line is used to move the pointer of tail pointer by 1 node
             //in order to link with upcoming nodes
         }
         //below code is used when while loop terminates. it links remaining nodes to result linkedlist
         if(list1==null){
             tail.next=list2;
         }
         else {
             tail.next=list1;
         }
         return result.next;
    }
}
