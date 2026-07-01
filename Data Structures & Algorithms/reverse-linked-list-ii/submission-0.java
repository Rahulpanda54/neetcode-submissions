
class Solution {
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
          ListNode dummy = new ListNode(-1);
          ListNode prev1  = dummy;

          dummy.next = head;

          ListNode curr = head;

          for(int i=0; i<left-1; i++){
            curr = curr.next;
            prev1 = prev1.next;

          }

          ListNode sublist = curr;    ListNode prev2 = null;

          for(int i=0; i<right-left+1; i++){

            ListNode nextnode = curr.next;

            curr.next = prev2;
            prev2 = curr;
            curr = nextnode;

          }

          prev1.next = prev2;
          sublist.next = curr;

          return dummy.next;

    }
 }

