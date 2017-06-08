import co.meihouwang.firstTry.SelectionProblem;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/31.
 */
public class MyTestSelection {

    @Test
    public void TestSelection(){

        SelectionProblem selectionProblem = new SelectionProblem();

        int[] test1 = {1,2,3};
        int[] test2 = {-1,2,3,23,6,8};
        Assert.assertEquals(2,selectionProblem.getKthBiggestProblem(
                test1,2));
        Assert.assertEquals(6,selectionProblem.getKthBiggestProblem2(
        test2,4));
    }
}
