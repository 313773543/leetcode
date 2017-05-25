import co.meihouwang.firstTry.Solution013;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/21.
 */
public class MyTest013 {


    @Test
    public void TestRomanToNum(){
        Solution013 solution013 = new Solution013();

        Assert.assertEquals(3,solution013.romanToInt("III"));
        Assert.assertEquals(4,solution013.romanToInt("IV"));
        Assert.assertEquals(1970,solution013.romanToInt("MCMLXX"));
        Assert.assertEquals(48,solution013.romanToInt("XLVIII"));
        Assert.assertEquals(3076,solution013.romanToInt("MMMLXXVI"));

    }
}
