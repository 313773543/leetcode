package co.meihouwang.firstTry;

import java.util.*;

/**
 * Created by wangbin7cmcm.com on 17/5/31.
 */
public class Solution018 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();


        if( nums.length < 4) return result;

        Arrays.sort(nums);

        for( int i = 0 ; i < nums.length-3 ; i++ ){

            int[] partNums = Arrays.copyOfRange(nums,i+1,nums.length);
            result = threeSum(partNums,target - nums[i]);

            for( int j =0 ; j < result.size(); j++ ){
                List<Integer> temp = result.get(j);
                temp.add(0,nums[i]);
                Collections.sort(temp);

                if( results.size() == 0 ){
                    results.add(temp);
                }else {
                    int k = 0;
                    for( ; k < results.size(); k++ ){

                        List<Integer> insideResult = results.get(k);

                        if( insideResult.get((0)).equals(temp.get(0)) && insideResult.get((1)).equals(temp.get(1)) && insideResult.get((2)).equals(temp.get(2))){
                            break;
                        }
                    }
                    if( k == results.size()) {
                        results.add(temp);
                    }
                }
            }

        }

        return results;
    }

    public List<List<Integer>> threeSum(int[] nums, int target) {

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

        for( int i = 0 ; i < length ;  ){

            for( int j = i+1,k= length-1; j < k;){
                if( numsList.get(i)  + (numsList.get(j) + numsList.get(k)) == target){

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

                }else if( numsList.get(i) + numsList.get(j) + numsList.get(k) < target ){

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
}
