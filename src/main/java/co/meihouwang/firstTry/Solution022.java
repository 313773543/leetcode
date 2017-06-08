package co.meihouwang.firstTry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangbin7cmcm.com on 17/6/2.
 */
public class Solution022 {

    List<List<Integer>> resultList;
    int numOfTotalL;

    public List<String> generateParenthesis(int n) {

        if( n == 0 ) return new ArrayList<String>();

        resultList = new ArrayList<List<Integer>>();
        numOfTotalL = n;

        List<Integer> pathList = new ArrayList<Integer>();
        pathList.add(0);

        if( numOfTotalL == 1 ){
            resultList.add(pathList);
        }else {

            countEachLevel(pathList,1);

        }



        ArrayList<String> resultStringList = new ArrayList<String>();


        char[] tempResult;

        for (int l = 0 ; l < resultList.size(); l++ ){

            pathList = resultList.get(l);

            tempResult = new char[numOfTotalL*2];


            for( int j = 0 ; j < pathList.size(); j++ ){
                tempResult[pathList.get(j)] = '(';
            }

            for( int k = 0 ; k < numOfTotalL*2 ; k++ ){
                if( tempResult[k] != '('){
                    tempResult[k] = ')';
                }
            }
            String result = new String(tempResult);
            resultStringList.add(result);
        }

        return resultStringList;
    }

    public void countEachLevel(List<Integer> currentPath, int numOfL){


        if( numOfL == numOfTotalL - 1 ){
            for( int i = currentPath.get(numOfL-1)+1;i<= (numOfL)*2;i++ ){
                ArrayList<Integer> curList = new ArrayList<Integer>(currentPath);
                curList.add(i);
                resultList.add(curList);
            }
        }else {

            for( int i = currentPath.get(numOfL-1)+1; i <= (numOfL)*2; i++ ){
                ArrayList<Integer> temp = new ArrayList<Integer>(currentPath);
                temp.add(i);
                countEachLevel(temp,numOfL+1);
            }

        }

    }

}
