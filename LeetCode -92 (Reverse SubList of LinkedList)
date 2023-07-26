/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

      static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
          ListNode next;
            while (head != null) {
             next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        /* if right and left position is equal return the position*/
    if (left == right)
        return head;

    ListNode revs = null; // store starting position of reverse starts
    ListNode revs_prev = null; // store  before starting position of reverse starts
    ListNode revend = null; //store end of the reverse position
    ListNode revend_next = null; // store next end of the reverse position 

      int i = 1;
    ListNode curr = head;
    while (curr!=null && i <= right) {
        if (i < left)
            revs_prev = curr;
        if (i == left)
            revs = curr;
        if (i == right) {
            revend = curr;
            revend_next = curr.next;
        }
        curr = curr.next;
        i++;
    }

// **Disconnect  node from right position i.e [2->3->4->5] =>[2->3->4->null]**

    revend.next = null;

// **Reverse the value from give left position to left position**

    revend = reverse(revs);


   // System.out.println(revend.val);
       // System.out.println(revs_prev.val);



    // **if starting i.e( previous of starting reverse position) is not equal to null condition success**

    if (revs_prev!=null)
{
        revs_prev.next = revend; **//[1->4]**
       // System.out.println(revs_prev.val);
        }

//**if starting i.e( previous of starting reverse position) is null**


    else
    {
        head = revend; // **[null->4] =>[4->...]**
    }

//**connect reverse last position to remaint end nodes. i.e -> [2->5]**
    revs.next = revend_next;
return head;
                }

   
}
