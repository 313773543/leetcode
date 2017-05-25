package co.meihouwang.firstTry;

/**
 * Created by wangbin7cmcm.com on 17/5/8.
 */
public class Solution556 {
    public static void main(String[] args){
        System.out.println("Hello");
        Solution556 solution556 = new Solution556();

        int[][] test = {{1,2,4},{2,3,6}};

        int[][] results = solution556.matrixReshape(test,3,2);

        System.out.println("Origin:" + solution556.printArrayInTwoDim(test));
        System.out.println("Results:" + solution556.printArrayInTwoDim(results));
    }

    public int[][] matrixReshape(int[][] nums,int r, int c){
        int height = nums.length;
        int length = nums[0].length;

        if ( height * length != r * c) {
            return nums;
        }


        int[][] results = new int[r][c];

        for( int j = 0; j < r ; j++ ){

            for ( int k = 0 ; k < c ; k++ ){
                int dim1 = (j*c+k)/length;
                int dim2 = (j*c+k)%length;
                results[j][k] = nums[dim1][dim2];
            }
        }

        return results;
    }

    public String printArrayInTwoDim(int[][] data){
        int height = data.length;
        int length = data[0].length;

        StringBuilder result = new StringBuilder();

        result.append("\n");
        for( int i = 0; i < height; i++){
            for( int j = 0 ; j < length ; j++ ){
                result.append(data[i][j] + "\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
