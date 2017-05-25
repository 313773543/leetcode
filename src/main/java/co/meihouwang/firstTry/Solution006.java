package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/5/10.
 */
public class Solution006 {
    public static void main(String[] args){
        System.out.println("Test");
        Solution006 solution006 = new Solution006();

        //String result = solution006.convert("PAYPALISHIRING",3);
        String result = solution006.convert("A",1);
        //String result = solution006.convert("",3);

        System.out.println(result);
    }

    public String convert1(String s, int numRows) {

        StringBuilder result = new StringBuilder();

        for( int i = 0 ; i < numRows; i++ ){
            if( i == (numRows-1) / 2){
                for (int j = i,k=0; j < s.length(); k++) {
                    if( k % 2 == 1 )
                    {
                        if( j + numRows/2 + 1 < s.length()) {
                            result.append(s.charAt(j + numRows / 2 + 1));
                        }
                        j += numRows + 1;
                    }else {
                        result.append(s.charAt(j));
                    }

                }

            }else {
                for (int j = i; j < s.length(); j += numRows + 1) {
                    result.append(s.charAt(j));
                }
            }

        }

        return result.toString();
    }
    public String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder();

        if( s == "") return "";

        if( numRows == 1 ){
            return s;
        }



        for ( int j = 0; j < s.length(); j+=numRows*2 -2 ){
            result.append(s.charAt(j));
        }

        for( int i = 1 ; i < numRows-1; i++){
            for ( int j = i,k=0; j < s.length(); k++){
                if( k%2 == 1){
                    if(j+( numRows -1 -i)*2 < s.length()) {
                        result.append(s.charAt(j+(numRows - 1 - i) * 2));
                    }
                    j += numRows*2 - 2;
                }else {
                    result.append(s.charAt(j));
                }

            }
        }

        for ( int j = numRows -1;  j < s.length(); j+=numRows*2 -2 ){
            result.append(s.charAt(j));
        }
        return result.toString();
    }

}
