package co.meihouwang.firstTry;

import java.util.Arrays;

/**
 * Created by wangbin7cmcm.com on 17/5/30.
 */
public class Solution016 {
    public int threeSumClosest(int[] nums, int target) {

        if( nums.length < 3) return 0;

        int length = nums.length;
        int minimumDiff = Integer.MAX_VALUE ;
        Arrays.sort(nums);

        for( int i = 0 ; i < length-1  ; ){

            int j = i+1, k=length-1;

            while (j < k){

                int tempSum = nums[i] + nums[j] + nums[k];

                int tempDiff = tempSum - target;
                if( Math.abs(tempDiff) < Math.abs(minimumDiff )){
                    minimumDiff = tempDiff;
                }

                if( tempDiff == 0 ){ return target;}
                else if( tempDiff < 0 ){
                    j++;
                }else {
                    k--;
                }
            }

            // Loop l to a position where its value equals ith
            int l = i+1;
            for( ; l < length && nums[l] == nums[i]; l++){}
            i=l;

        }

        return target + minimumDiff;
    }
}
