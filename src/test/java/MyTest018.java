import co.meihouwang.firstTry.Solution018;
import org.junit.Test;

/**
 * Created by wangbin7cmcm.com on 17/5/31.
 */
public class MyTest018 {
    @Test
    public void testQuadruplets(){

        Solution018 solution018 = new Solution018();

        int[] test1 = {1, 0, -1, 0, -2, 2};
        int[] test2 = {5,5,3,5,1,-5,1,-2};
        int[] test3 = {1,-2,-5,-4,-3,3,3,5};

//        solution018.fourSum(test1,0);
//        solution018.fourSum(test2,4);
        solution018.fourSum(test3,-11);

    }
}
