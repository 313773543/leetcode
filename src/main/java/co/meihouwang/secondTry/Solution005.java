package co.meihouwang.secondTry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangbin7cmcm.com on 17/5/4.
 */
public class Solution005 {
    public static void main(String[] args){
        Solution005 solution005 = new Solution005();

        String testString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        String result = solution005.getLongestPalindrome(testString);

        System.out.print(result);
    }

    public String getLongestPalindrome(String s){
        List<String> palindromeList = new ArrayList<String>();

        int length = s.length();
        for (int i = 0 ; i < length;) {

            StringBuilder palindrome = new StringBuilder();

            palindrome.append(s.charAt(i));


            int j = i + 1;
            for (; j < length; j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    palindrome.append(s.charAt(i));
                } else {
                    break;
                }
            }

            for (int k = i - 1, l = (j + (i - k) - 1); k >= 0 && l < length; k--, l++) {
                if (s.charAt(k) == s.charAt(l)) {

                    palindrome.insert(0, s.charAt(k)).append(s.charAt(l));

                } else {
                    break;
                }
            }
            palindromeList.add(palindrome.toString());

            i = j;
        }

        Collections.sort(palindromeList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return  o1.length() - o2.length();
            }
        });
        return palindromeList.get(palindromeList.size()-1);

    }
}
