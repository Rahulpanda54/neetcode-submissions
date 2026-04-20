
class Solution {
    public void reorderList(ListNode head) {

        if(head == null){
            return;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        ListNode first = head;
        ListNode mid = middle(head);
        ListNode sec = reverse(mid.next);
        mid.next = null;

        while(sec != null){
          
          curr.next = first;
          curr = first;
          first = first.next;

          curr.next = sec;
          curr = sec;
          sec = sec.next;

        }

        if(first != null){
            curr.next = first;
        }

        head = dummy.next;
        
    }

    public ListNode middle(ListNode head){

        if(head == null){
            return null;
        }

        ListNode hare = head;
        ListNode turtle = head;

        while(hare != null && hare.next != null){

            turtle = turtle.next;
            hare = hare.next.next;

        }

        return turtle;

    }

    public ListNode reverse(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode  prev = head;
        ListNode curr = head.next;

        while(curr != null){

            ListNode nextnode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextnode;

        }

        head.next = null;
        head = prev;

        return head;

    }
}
