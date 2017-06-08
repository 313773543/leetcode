package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/6/1.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = head;
        ListNode second = head;


        for( int i = 0 ; i < n ; i++ ){
            second = second.next;
        }
        if( second == null ){
            return first.next;
        }

        while (second.next != null ){
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;

        return head;
    }
}
