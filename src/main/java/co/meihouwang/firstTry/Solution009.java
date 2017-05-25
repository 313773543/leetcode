package co.meihouwang.firstTry;

import javax.sound.midi.SysexMessage;
import javax.swing.*;

/**
 * Created by wangbin7cmcm.com on 17/5/13.
 */
public class Solution009 {
    public static void main(String[] args){
        Solution009 solution009 = new Solution009();

        boolean result = solution009.isPalindrome(-8463443648L);

        System.out.println(result);

    }
    public boolean isPalindrome(long x) {

        if( x < 0 ) return false;

        int length = 0;

        boolean whetherIsPalindrome = true;
        long temp1 = x;
        long temp2 = x;

        for(; temp1 / (long)Math.pow(10,length) != 0 && length <= 9 ; ){
            length++;
        }


        for( int i = 0 ; i < (length) / 2 ; i++){

            int hightDigit = (int)(temp1/(long)(Math.pow(10,length-1-i)));
            temp1 = temp1 - (long)(Math.pow(10,length-1-i)) * hightDigit;

            int lowDigit = (int)(temp2 % 10L);
            temp2 = (temp2 - lowDigit)/10;

            if( hightDigit != lowDigit){
                whetherIsPalindrome = false;
            }

        }

        return whetherIsPalindrome;

    }
}
