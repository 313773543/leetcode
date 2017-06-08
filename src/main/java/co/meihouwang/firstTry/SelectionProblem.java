package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/5/31.
 */
public class SelectionProblem {

    public int getKthBiggestProblem(int[] data, int k){


        for( int i = 0 ; i < data.length; i++ ){
            for( int j = i+1; j < data.length; j++ ){
                if( data[j] < data[j-1]){
                    switchNum(data,j,j-1);
                }
            }

        }
        return data[k-1];
    }
    public int getKthBiggestProblem2(int[] data,int k){


        for( int i = 0 ; i < k; i++) {
            int tempBiggest = data[i];
            int position = i ;
            for(int j = i+1; j < data.length; j++ ){

                if( data[j] < tempBiggest){
                    tempBiggest = data[j];
                    position = j;
                }
            }
            switchNum(data,i,position);
        }


        return data[k-1];
    }

    public void switchNum (int[] data, int first,int seconde){

        if( data.length > first && data.length > seconde) {
            int temp = data[first];
            data[first] = data[seconde];
            data[seconde] = temp;

        }
    }
}
