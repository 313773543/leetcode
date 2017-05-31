import co.meihouwang.firstTry.Solution017;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/30.
 */
public class MyTest017 {

    @Test
    public void TestString(){

        String test1 = "23";

        Solution017 solution017 = new Solution017();


        Assert.assertEquals(9,solution017.letterCombinations(test1).size());
    }
}
