package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/5/25.
 */
public class Solution014 {

     public String longestCommonPrefix(String[] strs) {

          StringBuilder result = new StringBuilder() ;

          if( strs.length == 0 ) return "";

          int shortestLength = strs[0].length();
          int lengthOfInput = strs.length;
          for( int i = 0 ; i < lengthOfInput; i++ ){
               if( strs[i].length() < shortestLength){
                    shortestLength = strs[i].length();
               }
          }

          outer:
          for( int k = 0 ; k < shortestLength; k++ ){
               char singleChar = strs[0].charAt(k);
               int j = 1;
               for( ; j < lengthOfInput; j++ ){
                   if( strs[j].charAt(k) != singleChar ){
                       break outer;
                   }
               }
               if( j == lengthOfInput ){
                   result.append(singleChar);
               }
          }


          return result.toString();

     }

}
