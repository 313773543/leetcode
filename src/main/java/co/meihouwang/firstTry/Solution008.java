package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/5/13.
 */
public class Solution008 {
    public static void main(String[] args){

        Solution008 solution008 = new Solution008();
        String test1 = "+";
        String test2 = "    010";
        String test3 = "  -0012a42";
        String test4 = "+-2";
        String test5 = "-21474836948";
        String test6 = "21474836418";

        int result = (solution008.myAtoi(test5));

        System.out.println(result);
    }
    public int myAtoi(String str) {

        boolean possitive = true;

        str = str.trim();

        StringBuilder filteredStr = new StringBuilder();

        if( str.length() == 0 )
            return 0;

        if( str.charAt(0) == '+' ){
            str = str.substring(1);
            if( str.length() == 0 )
                return 0;
            if(str.charAt(0) == '-'){
                return 0;
            }
            if(str.charAt(0) == '+'){
                return 0;
            }
        }
        if (str.charAt(0) == '-' ){
            str = str.substring(1);
            possitive = false;
            if( str.length() == 0 )
                return 0;
            if(str.charAt(0) == '+'){
                return 0;
            }
            if(str.charAt(0) == '-'){
                return 0;
            }
        }

        for( int i = 0 ; i < str.length(); i++ ){
            int value = (int)str.charAt(i);
            if( value <= 57 && value >= 48 || value == '+' || value == '-'  ){
                filteredStr.append(str.charAt(i));
            }
            else {
                break;
            }
        }

        String valueStr = filteredStr.toString();

        if( possitive && valueStr.length() > 11){
            return 2147483647;
        }
        if( !possitive && valueStr.length() > 11 ){
            return  -2147483648;
        }


        int result = 0 ;

        long tmpResult = 0L;

        if( valueStr.length() == 0 ){
            result = 0;
        }
        else{
            try{
                tmpResult = Long.parseLong(valueStr);
            }catch(Exception e){
                System.out.println(e);
            }
        }

        if( !possitive ){
            if( tmpResult > 2147483648L )
            {
                result = -2147483648;
            }else {
                result = -(int)tmpResult;
            }
        }else {
            if (tmpResult > 2147483647L){
                result = 2147483647;
            }else {
                result = (int)tmpResult;
            }
        }
        return result;
    }
}
