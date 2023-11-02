// package Day 17;
// 19. Remove Nth Node From End of List
import java.util.*;
public class Day17 {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Calculate Size
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
          temp = temp.next;
          size++;
        }
        if(n==size){
          head = head.next; //here the 1st node of ll is removed 
          return head;
        }
        //Find Size-1 -> prev of removable node
        int i = 1;
        int iTOFInd = size-n;
        ListNode prev = head;
        while(i<iTOFInd){
          prev = prev.next;
          i++;
        }
        prev.next = prev.next.next;
        return head;

    }
}
}
