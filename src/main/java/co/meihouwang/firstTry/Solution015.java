package co.meihouwang.firstTry;

import java.util.*;

/**
 * Created by wangbin7cmcm.com on 17/5/25.
 */
public class Solution015 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        List<Integer> numsList = new ArrayList<Integer>();

        for (int i = 0 ; i < nums.length ; i++ ){
            numsList.add(nums[i]);
        }


        Collections.sort(numsList, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        int length = nums.length;

        for( int i = 0 ; i < length && numsList.get(i) <= 0;  ){

            for( int j = i+1,k= length-1; j < k;){
                if( numsList.get(i)  + (numsList.get(j) + numsList.get(k)) == 0){

                    List<Integer> result = new ArrayList<Integer>();

                    result.add(numsList.get(i));
                    result.add(numsList.get(j));
                    result.add(numsList.get(k));
                    results.add(result);

                    int l = j+1;
                    for( ; l < length && numsList.get(l).equals( numsList.get(j)) ; ){
                        l++;
                    }
                    j=l;

                }else if( numsList.get(i) + numsList.get(j) + numsList.get(k) < 0 ){

                    int l = j+1;
                    for( ; l < length && numsList.get(l).equals(numsList.get(j)) ; ){
                        l++;
                    }
                    j=l;
                }else {
                    int l = k-1;
                    for( ;l >= 0 && numsList.get(l).equals(numsList.get(k)) ; ){
                        l--;
                    }
                    k=l;

                }

            }
            int l = i+1;
            for (;l < length && numsList.get(l).equals( numsList.get(i)) ; ){
                l++;
            }
            i = l;
        }

        return results;
    }


    public List<List<Integer>> threeSum2(int[] nums) {


        List<Integer> list = new ArrayList<Integer>();

        for( int i = 0 ; i < nums.length ; i++ ){
            list.add(nums[i]);
        }


        int length = nums.length;

        if( length < 3 ){
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        for( int i = 0 ; i < list.size(); i++){

            outer:
            for ( int j = i+1; j < list.size() ; j++ ){
               int pseudoThird = -(list.get(i) + list.get(j));
               if( list.subList(j+1,list.size()).contains(pseudoThird)){
                   List<Integer> result = new ArrayList<Integer>();
                   result.add(list.get(i));
                   result.add(list.get(j));
                   result.add(pseudoThird);

                   Collections.sort(result);

                   for( int k = 0 ; k < results.size(); k++ ){
                       if( results.get(k).get(0) == result.get(0) && results.get(k).get(1) == result.get(1)){
                           continue outer;
                       }
                   }

                   results.add(result);

                   //list.remove(i);
                   //list.remove(j);
                   //list.remove(new Integer(pseudoThird));
               }
            }

        }

        return results;

    }
}
