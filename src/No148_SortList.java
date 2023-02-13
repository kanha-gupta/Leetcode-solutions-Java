import java.util.Arrays;

public class No148_SortList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

        public ListNode sortList(ListNode head) {
            //approach is, we store the values in an array, sort it & then allocate it again
            //in linkedList using iteration
            //time complexity O(Ologn)
            ListNode temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            temp = head; //reset temp
            int[] array = new int[count];
            count = 0; //reset counter

            while (temp != null) {
                array[count] = temp.val;
                count++;
                temp = temp.next;
            }
            temp = head; //reset again
            Arrays.sort(array); //sorting array
            int counter2 = 0;
            while (temp != null) {
                temp.val = array[counter2];
                counter2++;
                temp = temp.next;
            } //filled values of sorted array
            return head;
        }
    }
