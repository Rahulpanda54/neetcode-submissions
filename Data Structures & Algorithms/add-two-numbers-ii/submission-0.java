class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;

        while(temp1 != null || temp2 != null){

            int sum = carry;

            if(temp1 != null){
                sum = sum + temp1.val;
            }

            if(temp2 != null){
                sum = sum + temp2.val;
            }

            ListNode newnode = new ListNode(sum%10);
            carry = sum/10;

            curr.next = newnode;
            curr = curr.next;

            if(temp1 != null){
                temp1 = temp1.next;
            }

            if(temp2 != null){
                temp2 = temp2.next;
            }
        }

        if(carry != 0){
            ListNode newnode = new ListNode(carry);
            curr.next = newnode;
        }

        return reverseList(dummy.next);

    }



    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
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