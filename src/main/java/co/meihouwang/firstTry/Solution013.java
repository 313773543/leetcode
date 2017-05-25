package co.meihouwang.firstTry;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangbin7cmcm.com on 17/5/21.
 */
public class Solution013 {
    public int romanToInt(String s) {


        Map<String,Integer> digitsMap = new HashMap<String, Integer>();
        digitsMap.put("I",1);
        digitsMap.put("IV",4);
        digitsMap.put("V",5);
        digitsMap.put("IX",9);
        digitsMap.put("X",10);
        digitsMap.put("XL",40);
        digitsMap.put("L",50);
        digitsMap.put("XC",90);
        digitsMap.put("C",100);
        digitsMap.put("CD",400);
        digitsMap.put("D",500);
        digitsMap.put("CM",900);
        digitsMap.put("M",1000);

        int length = s.length();

        int result = 0;

        for( int i = 0 ; i < length ; ){
           if (i < length - 1 && digitsMap.get(s.substring(i,i+2)) != null) {
               result += digitsMap.get(s.substring(i,i+2)) ;
               i += 2;
           } else {
               result += digitsMap.get(s.substring(i,i+1));
               i++;
           }

        }


        return result;
    }

    public static void main(String args[] ){
        System.out.println("Test");
    }
}
