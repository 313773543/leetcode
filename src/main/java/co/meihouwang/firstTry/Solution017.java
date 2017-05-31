package co.meihouwang.firstTry;

import java.util.*;

/**
 * Created by wangbin7cmcm.com on 17/5/30.
 */
public class Solution017 {

    public List<String> letterCombinations(String digits) {

        Map<Integer,List<String>> digitLetter = new HashMap<Integer, List<String>>();

        digitLetter.put(2, Arrays.asList("a","b","c"));
        digitLetter.put(3, Arrays.asList("d","e","f"));
        digitLetter.put(4, Arrays.asList("g","h","i"));
        digitLetter.put(5, Arrays.asList("j","k","l"));
        digitLetter.put(6, Arrays.asList("m","n","o"));
        digitLetter.put(7, Arrays.asList("p","q","r","s"));
        digitLetter.put(8, Arrays.asList("t","u","v"));
        digitLetter.put(9, Arrays.asList("w","x","y","z"));


        List<String> originList = new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        List<String> resultTemp = new ArrayList<String>();

        if( null == digits || digits.length() == 0 ) return result;

        if(  digits.length() == 1 ) {

            return digitLetter.get(Integer.valueOf(String.valueOf(digits.charAt(0))));
        }




        resultTemp = digitLetter.get(Integer.valueOf(String.valueOf(digits.charAt(0))));
        result = resultTemp;



        for( int i = 1 ; i < digits.length(); i++ ){
            resultTemp = result;
            result = new ArrayList<String>();

            originList = digitLetter.get(Integer.valueOf(String.valueOf(digits.charAt(i))));

            for(int j = 0; j < resultTemp.size(); j++){

                for(int k = 0 ; k < originList.size(); k++ ){
                    StringBuilder originString = new StringBuilder(resultTemp.get(j));
                    originString.append(String.valueOf(originList.get(k)));
                    result.add(originString.toString());
                }

            }

        }

        return result;

    }
}
