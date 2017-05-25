package co.meihouwang.firstTry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangbin7cmcm.com on 17/5/3.
 */

public class Solution005V2 {
    public static void main(String[] args){
        System.out.println("Solution 005");
        String test = "abcda";
        Solution005V2 solution005V2 = new Solution005V2();

        String result = solution005V2.longestPalindrome(test);
        System.out.println("Result of " + test + " is " + result);

    }


    public String longestPalindrome(String s){

        int length = s.length();
        List<String> listOfPalindrome = new ArrayList<String>();


        for (int i = 0 ; i < length;  ){
            StringBuilder palindrome = new StringBuilder() ;


            palindrome.append(s.charAt(i));
            int j = i+1;
            for (  ; j < length ; j++ ){
                if( s.charAt(j) == s.charAt(i)){
                    palindrome.append(s.charAt(i));
                }else {
                    break;
                }
            }


            for ( int k = i - 1,l=(j+(i-k)-1) ; k >= 0 && l < length; k--,l++ ){
                if( s.charAt(k) == s.charAt(l)){
                    palindrome.insert(0,s.charAt(k)).append(s.charAt(l));
                }else {
                    break;
                }

            }

            listOfPalindrome.add(palindrome.toString());


            i = j;



        }

        Collections.sort(listOfPalindrome,new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });

        if (listOfPalindrome.size() == 0 ){
            return String.valueOf(s.charAt(0));
        }

        return listOfPalindrome.get(listOfPalindrome.size() - 1);
    }
}

