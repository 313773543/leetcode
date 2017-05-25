import co.meihouwang.firstTry.Solution012;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/20.
 */
public class MyTest012 {

    @Test
    public void TestSolution012(){
        Solution012 solution012 = new Solution012();

        Assert.assertEquals("III",solution012.intToRoman(3));
        Assert.assertEquals("II",solution012.intToRoman(2));
        Assert.assertEquals("IX",solution012.intToRoman(9));
        Assert.assertEquals("VIII",solution012.intToRoman(8));
        Assert.assertEquals("VII",solution012.intToRoman(7));
        Assert.assertEquals("V",solution012.intToRoman(5));

        Assert.assertEquals("X",solution012.intToRoman(10));
        Assert.assertEquals("XIX",solution012.intToRoman(19));


        Assert.assertEquals("CM",solution012.intToRoman(900));
        Assert.assertEquals("MCMLXX",solution012.intToRoman(1970));
        Assert.assertEquals("XCVIII",solution012.intToRoman(98));

//        Assert.assertEquals("XXX",solution012.intToRoman(30));
//        Assert.assertEquals("X",solution012.intToRoman(10));
//        Assert.assertEquals("IX",solution012.intToRoman(9));

    }
}
