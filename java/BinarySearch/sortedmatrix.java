package BinarySearch;
import java.util.Arrays;
public class sortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10, 11,12}
        };
        System.out.println((Arrays.toString(search(arr,11 ))));
    } // search in the row provided between colms provided

    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd) {
      
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
                return new int[] { row, mid };
            if (matrix[row][mid] > target)
                cEnd = mid - 1;
            else
                cStart = mid + 1;
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int colms = matrix[0].length;

        if (rows == 1)
            return binarySearch(matrix, target, 0, 0, colms - 1);
        int rStart = 0; // these are the indexes
        int rEnd = rows - 1;
        int cMid = colms / 2;
        // run the loop till two rows are remaining..
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 row
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target)
                return new int[] { mid, cMid };       // cmid is common
            if (matrix[mid][cMid] < target)
                rStart = mid;
       //     if (matrix[mid][cMid] > target)
            else rEnd = mid;
        } // we have two rows..after running the while loop
          // check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid] == target)
            return new int[] { rStart, cMid };      // here colums is same but row is changing
        if (matrix[rStart + 1][cMid] == target) // 2
            return new int[] { rStart+1, cMid }; // 6
        // 1 2 3 4     01234   it may be this  here mid coum is 27   target 0
        // 5 6 7 8     56789
        // search in 1st half(1)
        if (target <= matrix[rStart][cMid - 1])
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        // search in 2nd half(3,4)
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][colms - 1])
            return binarySearch(matrix, target, rStart, cMid + 1, colms - 1);
        // search in 3rd half(5)
        if (target <= matrix[rStart + 1][cMid - 1])
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        // search in 4th half(7,8)
     //    if(target>=matrix[rStart+1][cMid+1] && target<=matrix[rStart+1][cols-1])
            return binarySearch(matrix, target, rStart + 1, cMid + 1, colms - 1); // line 51 & 50 are same...

    }
}
