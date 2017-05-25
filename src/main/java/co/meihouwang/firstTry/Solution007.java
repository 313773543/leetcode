package co.meihouwang.firstTry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wangbin7cmcm.com on 17/5/12.
 */
public class Solution007 {
    public static void main(String[] args){
        Solution007 solution007 = new Solution007();

        System.out.println(solution007.reverse(2147483647));
        System.out.println(solution007.reverse(-321));
    }

    public int reverse(int x) {
        List<Integer> digits = new ArrayList<Integer>();
        long result = 0L;

        long tmp = x;

        int length = 0;
        for ( ; tmp/(long)Math.pow(10,length) != 0; ){
            length++;
        }

        for( int i = length - 1 ;i > -1 ; i-- ){
            int digit = (int) (tmp/((long)Math.pow(10,i)));

            digits.add(digit);

            tmp -= digit * (int)Math.pow(10,i);

        }

        for( int j = 0; j < length;j++) {

            result = (long)(result + digits.get(j) * Math.pow(10,j));
        }
        if( result > 2147483647L || result < -2147483648L){
            result = 0L;
        }

        return (int)result;

    }
}
