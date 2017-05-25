import co.meihouwang.firstTry.Solution010;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/15.
 */
public class MyTest extends TestCase {

    String s1;
    String p1;

    public MyTest(String testName){
        super(testName);
    }

    protected void setUp() throws Exception{
        super.setUp();
        s1 = "abc";
        p1 = "abc";
    }

    @Test
    public void testIsMatch(){
        Solution010 solution010 = new Solution010();

        Assert.assertEquals(true,solution010.isMatch(s1,p1));
        Assert.assertEquals(false,solution010.isMatch("aa","a"));
        Assert.assertEquals(true,solution010.isMatch("aa","aa"));
        Assert.assertEquals(false,solution010.isMatch("aaa","aa"));
        Assert.assertEquals(true,solution010.isMatch("aa", "a*"));
        Assert.assertEquals(true,solution010.isMatch("aa", ".*"));
        Assert.assertEquals(true,solution010.isMatch("ab", ".*"));
        Assert.assertEquals(true,solution010.isMatch("aab", "c*a*b"));
        Assert.assertEquals(false,solution010.isMatch("abcd", "d*"));
        Assert.assertEquals(true,solution010.isMatch("aaa", "ab*ac*a"));
        Assert.assertEquals(true,solution010.isMatch("ab", ".*..c*"));
        Assert.assertEquals(true,solution010.isMatch("aaa", "ab*a*c*a"));
        Assert.assertEquals(false,solution010.isMatch("a", "ab*a"));
        Assert.assertEquals(true,solution010.isMatch("", ".*"));
        Assert.assertEquals(true,solution010.isMatch("aaa", "a*a"));
        Assert.assertEquals(true,solution010.isMatch("bab", "..*"));
        Assert.assertEquals(true,solution010.isMatch("abcaaaaaaabaabcabac", ".*ab.a.*a*a*.*b*b*"));
        Assert.assertEquals(true,solution010.isMatch("cbaacacaaccbaabcb", "c*b*b*.*ac*.*bc*a*"));

    }
}
