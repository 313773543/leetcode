package co.meihouwang.firstTry;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by wangbin7cmcm.com on 17/6/2.
 */
public class Solution020 {
    public boolean isValid(String s) {

        Stack<Character> charactersStack = new Stack<Character>();

        Map<Character,Character> mapping = new HashMap<Character,Character>();

        mapping.put(']','[');
        mapping.put(')','(');
        mapping.put('}','{');

        for( int i = 0 ; i < s.length(); i++ ){
            char letter = s.charAt(i);
            if( letter == ']' || letter == '}' || letter == ')'  ){

                if( charactersStack.size() == 0 ) return false;

                char targetLetter = charactersStack.peek();
                if( targetLetter == mapping.get(letter) ){
                    charactersStack.pop();

                }else {
                    break;
                }
            }else {
                charactersStack.push(letter);
            }
        }

        if( charactersStack.size() == 0 ) {
            return true;
        }else {
            return false;
        }

    }
}
