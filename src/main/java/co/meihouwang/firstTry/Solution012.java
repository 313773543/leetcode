package co.meihouwang.firstTry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangbin7cmcm.com on 17/5/19.
 *
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class Solution012 {

    public String intToRoman(int num) {

        String[] romans = {"I","V","X","L","C","D","M"};
        String roman = null;

        // Get the num of whole digits of this num

        List<Integer> digits = new ArrayList<Integer>();

        int tenPow = 1;
        int numOfDigits = 0;
        int partOfNum = num;

        for( ; num / tenPow != 0 ; numOfDigits++ ){

            tenPow *= 10;
            digits.add(partOfNum % 10);
            partOfNum = partOfNum / 10;

        }

//        Collections.reverse(digits);

        String result = "";

        for (int i = numOfDigits - 1 ; i > -1 ; i-- ){

            int thisDigit = digits.get(i);


            if( thisDigit <= 3 ){
                for( int j = 0 ; j < thisDigit; j++ )
                    result += romans[i*2];
            }else if(thisDigit == 4) {
                result += romans[i*2] + romans[i*2+1];
            }else if( thisDigit == 5 ){
                result += romans[i*2+1];
            }else if( thisDigit > 5 && thisDigit <= 8 ){
                result += romans[i*2+1];
                for( int j = 0 ; j < thisDigit - 5 ; j++ ){
                    result += romans[i*2];
                }
            }else if( thisDigit == 9 ){
                result += romans[i*2]+romans[i*2+2];
            }

        }

//        if( num % 10 < 10){
//            roman = romans[num-1];
//        }

        return result;

    }


    public static void main(String[] args){

        Solution012 solution012 = new Solution012();


        solution012.intToRoman(1);

    }

}
