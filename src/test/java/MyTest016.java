import co.meihouwang.firstTry.Solution016;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/30.
 */
public class MyTest016 {

    @Test
    public void TestThreeSum(){

        int[] test1 = {-1,2,1,4};
        int[] test2 = {1,1,1,1};

        Solution016 solution016 = new Solution016();


        Assert.assertEquals(2,solution016.threeSumClosest(test1,1));
        Assert.assertEquals(3,solution016.threeSumClosest(test2,0));

    }
}
