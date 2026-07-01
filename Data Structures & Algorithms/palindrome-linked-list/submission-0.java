class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
            return true;
        }

        ListNode first = head;
        ListNode mid = middle(head);
        ListNode sec = reverse(mid.next);
        mid.next = null;

        while(sec != null){

            if(first.val != sec.val){
                return false;
            }

            first = first.next;
            sec = sec.next;

        }

        return true;
    }

    public ListNode middle(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){

            turtle = turtle.next;
            hare = hare.next.next;

        }

        return turtle;
    }

    public ListNode reverse(ListNode head){

        if(head == null){
            return null;
        }

        ListNode prev = head;
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