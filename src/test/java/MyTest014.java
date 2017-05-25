import co.meihouwang.firstTry.Solution014;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/25.
 */
public class MyTest014 {
    @Test
    public void TestShortestPrefix(){

        Solution014 solution014 = new Solution014();

        String[] test1 = {"abc","abec","abd"};
        String[] test2 = {};
        String[] test3 = {"aca","cba"};

        Assert.assertEquals("ab",solution014.longestCommonPrefix(test1));
        Assert.assertEquals("",solution014.longestCommonPrefix(test2));
        Assert.assertEquals("",solution014.longestCommonPrefix(test3));

    }
}
