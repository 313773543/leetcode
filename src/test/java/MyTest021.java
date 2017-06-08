import co.meihouwang.firstTry.ListNode;
import co.meihouwang.firstTry.Solution021;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/6/2.
 */
public class MyTest021 {

    @Test
    public void TestMerge(){

        ListNode test1 = new ListNode(0);
        test1.next = new ListNode(1);
        test1.next.next = new ListNode(2);
        test1.next.next.next = new ListNode(3);

        ListNode test2 = new ListNode(2);
        test2.next = new ListNode(3);
        test2.next.next = new ListNode(4);
        test2.next.next.next = new ListNode(5);

        Solution021 solution021 = new Solution021();
        solution021.mergeTwoLists(test1,test2);

    }
}
