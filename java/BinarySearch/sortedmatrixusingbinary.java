package BinarySearch;

import java.util.Arrays;

import Recursion.reverse;

public class sortedmatrixusingbinary {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.toString(search(arr, 3)));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int colums = matrix[0].length;
        if (rows == 1)
            binaryseach(matrix, target, 0, 0, colums - 1);
        int rStart = 0;
        int rEnd = rows - 1;
        int cmid = colums / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cmid]==target)  return new int[]{mid,cmid};
            if (target > matrix[mid][cmid])  rStart = mid;
            else rEnd = mid;
        } 
         if (matrix[rStart][cmid] == target)  return new int[] { rStart, cmid };
        if (matrix[rStart + 1][cmid] == target) return new int[] { rStart + 1, cmid };
        if (target <= matrix[rStart][cmid - 1])
            return binaryseach(matrix, target, rStart, 0, cmid - 1);
        if (target >= matrix[rStart][cmid + 1] && target <= matrix[rStart][colums - 1])
            return binaryseach(matrix, target, rStart, cmid + 1, colums - 1);
        if (target <= matrix[rStart + 1][cmid - 1])
            return binaryseach(matrix, target, rStart + 1, 0, cmid - 1);
        else return binaryseach(matrix, target, rStart + 1, cmid + 1, colums - 1);
    }
    static int[] binaryseach(int[][] arr, int target, int rStart, int cStart, int cEnd) {
        int mid = cStart + (cEnd - cStart) / 2;
        while (cStart <= cEnd) {
            if (arr[rStart][mid] == target)
                return new int[] { rStart, mid };
            if (target < arr[rStart][mid])  cEnd = mid - 1;
            else cStart = mid + 1;
        }
        return new int[] { -1, -1 };
    }
}
