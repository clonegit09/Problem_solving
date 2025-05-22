// search in sorted 2d array 
import java.util.Arrays;

public class BSin2d {
    public static void main(String[] args) {
        int[][] arr={
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        
        };
        System.out.println(Arrays.toString(search(arr,29)));
        }
        static int[] search(int[][] matrix, int target){
            int r=0;
            int c=matrix.length-1;

            while(r<matrix.length && c>=0){

                if(matrix[r][c]==target){
                    return new int[]{r,c};
                }

                else if(matrix[r][c]<target){
                    r++;
                }
                else{
                    c--;
                }
            }
            return new int[]{-1,-1};
        }

    }

