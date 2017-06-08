import co.meihouwang.firstTry.Solution022;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/6/6.
 */
public class MyTest022 {
    @Test
    public void testGenerateParenthesis(){
        Solution022 solution022 = new Solution022();

        solution022.generateParenthesis(0);
        solution022.generateParenthesis(1);
        solution022.generateParenthesis(2);
        solution022.generateParenthesis(3);
        solution022.generateParenthesis(4);
        solution022.generateParenthesis(5);

    }
}
