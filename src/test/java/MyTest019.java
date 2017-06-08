import co.meihouwang.firstTry.ListNode;
import co.meihouwang.firstTry.Solution019;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/6/2.
 */
public class MyTest019 {
    @Test
    public void TestRemove(){

        Solution019 solution019 = new Solution019();

        ListNode a = new ListNode(3);
        a.next = new ListNode(1);
        a.next.next = new ListNode(0);


        ListNode b = new ListNode(1);
//        Assert.assertEquals(2,solution019.removeNthFromEnd(a,1));
//        solution019.removeNthFromEnd(a,1);
        solution019.removeNthFromEnd(b,1);

    }
}
