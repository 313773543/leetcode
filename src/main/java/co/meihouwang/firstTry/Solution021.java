package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/6/2.
 */
public class Solution021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if( l1 == null ){
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode newList, curNode;
        if( l1.val < l2.val ){
            curNode = newList = new ListNode(l1.val);
            l1 = l1.next;
        }else {
            curNode = newList = new ListNode(l2.val);
            l2 = l2.next;
        }


        while (l1 != null && l2 != null ){
            if( l1.val > l2.val ){
                curNode.next = new ListNode(l2.val);
                curNode = curNode.next;
                l2 = l2.next;
            }else {
                curNode.next = new ListNode(l1.val);
                curNode = curNode.next;
                l1 = l1.next;
            }
        }
        if( l1 == null ){
            while (l2 != null ){
                curNode.next = new ListNode(l2.val);
                curNode = curNode.next;
                l2 = l2.next;
            }
        }else {
            while (l1 != null ){
                curNode.next = new ListNode(l1.val);
                curNode = curNode.next;
                l1 = l1.next;
            }
        }

        return newList;
    }
}
