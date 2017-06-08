package co.meihouwang.firstTry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wangbin7cmcm.com on 17/6/1.
 */
public class Solution018_2 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if( nums.length < 4) {
            return results;
        }


        Arrays.sort(nums);

        int length = nums.length;

        for( int i = 0 ; i < length - 3 ; i++ ){

            if( nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target ){
                break;
            }
            if( nums[i] + nums[length - 3] + nums[length - 2] + nums[length-1] < target ){
                continue;
            }

            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            for( int j = i+1 ; j < length -2 ; j++ ){
                if( nums[i] + nums[j] + nums[j+1] + nums[j+2] > target ) break;
                if( nums[i] + nums[j] + nums[length-2] + nums[length-1] < target) continue;

                if( j > i+1 && nums[j] == nums[j-1]) continue;

                int low = j + 1, high = length - 1;

                while (low < high ){
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if( sum == target ) {
                        results.add(Arrays.asList(nums[i] , nums[j],nums[low],nums[high]));

                        while (low < high && nums[low] == nums[low+1]) low++;
                        while (low < high && nums[high] == nums[high-1]) high--;

                        low++;
                        high--;
                    }
                    else if( sum < target ) low++;
                    else {
                        high--;
                    }

                }

            }

        }


        return results;




    }
}
