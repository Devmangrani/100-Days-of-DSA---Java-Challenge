public class Day47 {
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode Fast = head;
        while(Fast != null && Fast.next != null){
            slow = slow.next;
            Fast = Fast.next.next;
        }
        return slow;
    }
}
}
