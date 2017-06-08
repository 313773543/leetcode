import co.meihouwang.firstTry.Solution020;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/6/2.
 */
public class MyTest020 {
    @Test
    public void TestIsValid(){
        Solution020 solution020 = new Solution020();

        String test1 = "()[]{}";
        String test2 = "()[]{}(";
        String test3 = "]";

        Assert.assertEquals(true,solution020.isValid(test1));
        Assert.assertEquals(false,solution020.isValid(test2));
        Assert.assertEquals(false,solution020.isValid(test3));

    }
}
