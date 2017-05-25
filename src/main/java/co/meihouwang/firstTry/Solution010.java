package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/5/15.
 */
import org.junit.*;


/**
 *  There are only four conditions
 *
 *
 */

public class Solution010 {
    public static void main(String[] args){

        Solution010 solution010 = new Solution010();

        boolean result7 = solution010.isMatch("aa", "a*");

        System.out.println(result7);

    }

    public boolean isMatch(String s, String p) {

        int sLength = s.length();
        int pLength = p.length();

        if( sLength == 0 && pLength == 0){
            return true;
        }
        if( sLength == 0 && pLength != 0){
            if( pLength%2 == 1 ){
                return  false;
            }

            for( int n = 0 ; n < pLength; n+=2){
                if( p.charAt(n+1) != '*'){
                    return false;
                }

            }

            return true;

        }

        int i=0 ,j=0 ;

        outerLoop:
        for( ; i < sLength && j != pLength - 1 && j < pLength && pLength != 0 ;){

            for ( ; j < pLength - 1 ; ){

                if( i == sLength ){


                    if( (pLength - j ) % 2 == 1  )
                        return  false;
                    for( int n = j ; n < pLength; n+=2){
                        if( p.charAt(n+1) != '*'){
                            return false;
                        }

                    }
                    return true;


                }

                // ab ab | ab a.
                if( p.charAt(j+1) != '*'){

                    // ab a.
                    if( p.charAt(j) == '.'){
                        i++;
                        j++;


                    // ab ab
                    }else {
                        if( p.charAt(j) == s.charAt(i)){
                            i++;
                            j++;

                        // ab ac
                        }else {
                            return false;
                        }
                    }

                }else {

                    // ab a*
                    if( p.charAt(j) != '.' ){

                        // ab c*
                        if( p.charAt(j) != s.charAt(i) ){

                            //i++;
                            j+=2;

                        // ab a*
                        }else {
                            boolean tempResult = false;
                            int k = i;
                            for( ; k < sLength  && s.charAt(k) == p.charAt(j) ; ){
                                tempResult = tempResult || isMatch(s.substring(k),p.substring(j+2));
                                k++;
                            }

                            tempResult = tempResult || isMatch(s.substring(k),p.substring(j+2));

                            return tempResult;
                        }
                    }else {
                        boolean tempResult = false;
                        if( pLength - j == 2) return  true;

                        for( int k = i; k < sLength; k++){
                            tempResult = tempResult || isMatch(s.substring(k),p.substring(j+2));
                            if( tempResult ) return true;
                        }

                        tempResult = tempResult ||  isMatch("",p.substring(j+2));

                        return tempResult;

                    }
                }


            }
        }

        // Once we arrive the end of the string check whether they are equal or the end of the p string is dot
        if( i == sLength -1  && j == pLength - 1 && (s.charAt(sLength-1) == p.charAt(pLength-1) || p.charAt(pLength-1) == '.')){
            return true;
        }else {
            return  false;

        }
    }

}
