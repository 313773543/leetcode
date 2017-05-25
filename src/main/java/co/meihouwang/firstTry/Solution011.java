package co.meihouwang.firstTry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by wangbin7cmcm.com on 17/5/17.
 */

public class Solution011{
    public int maxArea(int[] height){
        int high = height.length-1;
        int low = 0;
        int maxArea = 0;

        while(low < high){
            maxArea = Math.max(maxArea,(height[low] > height[high] ? height[high] : height[low]) * (high-low) );

            if( height[high] > height[low]){
                low++;
            }else {
                high--;
            }
        }
        return maxArea;
    }
}

class Solution011_inside{
    public int maxArea(int[] height){
        int size = height.length;
        int area = 0 ;
        int maxArea = 0 ;
        for( int i = 0 ; i < size ; i ++ ){
           if( height[i] == 0 ) continue;
           for( int j = i+1 ; j < size; j++ ){
               if( height[j] == 0 ) continue;
               area =( height[i] > height[j] ? height[j] : height[i]) * (j - i);
               if( maxArea < area )
                   maxArea = area;

           }

        }
        return  maxArea;
    }

}

class Solution012_inside {


    public int maxArea(int[] height) {

        List<Element>  eles = new ArrayList<Element>();

        for( int i = 0 ; i < height.length ; i++ ){
            eles.add(new Element(height[i],i));
        }

        Collections.sort(eles,new Comparator<Element>() {
            public int compare(Element o1, Element o2) {
                return  o2.value - o1.value;
            }
        });

        int size = eles.size();

        int maxArea = 0 ;
        int area = 0;

        for( int i = 1; i < size  ; i++ ){
            int maxWeight = 0 ;
            for( int j = i ; j > 0 ; j-- ){
                int weight1 = Math.abs(eles.get(i).position - eles.get(j-1).position);
                if( maxWeight < weight1 ){
                    maxWeight = weight1;
                }
            }
            int height1 = eles.get(i).value;

            area = height1 * maxWeight;

            if( maxArea < area ){
                maxArea = area;
            }
        }

        return  maxArea;
    }

}

class Element {
    public Element(int v, int p){
        value = v;
        position = p;
    }
    public int value;
    public int position;
}
