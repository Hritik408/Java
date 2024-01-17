package BinarySearch;

import java.util.Arrays;

public class helloworld {
    public static void main(String[] args) {
        int[][] arr={
                  {1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12},
                  {13,14,15,16}
                 };
    int target = 14;

        System.out.println(Arrays.toString(search(arr,target)));
    }
       static int[] search(int[][] matrix,int target){
        int row = 0;
        int column = matrix.length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column]==target) return new int[]{row,column};
            if(matrix[row][column]<target)  row++;
            else column--;              // it is the screnio in the case of sorted matrix.
        }   return   new int[]{-1,-1};
        }}
