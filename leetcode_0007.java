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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        int sum = 0;
        int carry_forward = 0;

        while (l1 != null || l2 != null || carry_forward != 0) {
            sum = carry_forward;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int num = sum % 10;
            carry_forward = sum / 10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        return ans.next;
    }
}
