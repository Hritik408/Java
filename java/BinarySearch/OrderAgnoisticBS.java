package BinarySearch;

 import java.util.Arrays;
public class OrderAgnoisticBS {
    // public static void main(String[] args) {
    //   //  int[] arr = {1,2,3,4,5};
    //     int[] arr = {5,4,3,2,1};
    //     int target = 5;
    //     int  ans = searchbinary(arr,target);
    //     System.out.println(ans);
    //     // here we can find both ascending nd desecding order..
        
    // }  static int searchbinary(int[] arr,int target){
    //     int start = 0;
    //     int end = arr.length-1;
    //     boolean isasc = arr[start]<arr[end];
    //     while(start<=end){
    //         int mid = start + (end-start)/2;
    //         if(arr[mid]==target)  return mid;
    //         if(isasc){
    //             if(arr[mid]<target)  start=mid+1;
    //            else end=mid-1;
    //         }  else{
    //             if(arr[mid]<target)  end = mid-1;
    //             else start = mid+1;
    //         }

    //         }  return -1;
    //     }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println((Arrays.toString(search(arr, 5))));
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
        int cols = matrix[0].length;

        if (rows == 1)
            return binarySearch(matrix, target, 0, 0, cols - 1);
        int rStart = 0; // these are the indexes
        int rEnd = rows - 1;
        int cMid = cols / 2;
        // run the loop till two rows are remaining..
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 row
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target)
                return new int[] { mid, cMid };
            if (matrix[mid][cMid] < target)
                rStart = mid;
            if (matrix[mid][cMid] > target)
                rEnd = mid;
        } // we have two rows..after running the while loop
          // check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid] == target)
            return new int[] { rStart, cMid };
        if (matrix[rStart + 1][cMid] == target) // 2
            return new int[] { rStart, cMid }; // 6
        // 1 2 3 4
        // 5 6 7 8
        // search in 1st half(1)
        if (target <= matrix[rStart][cMid - 1])
            return binarySearch(matrix, target, rStart, 0, cMid - 1);
        // search in 2nd half(3,4)
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1])
            return binarySearch(matrix, target, rStart, cMid + 1, cols - 1);
        // search in 3rd half(5)
        if (target <= matrix[rStart + 1][cMid - 1])
            return binarySearch(matrix, target, rStart + 1, 0, cMid - 1);
        // search in 4th half(7,8)
        // if(target>=matrix[rStart+1][cMid+1] && target<=matrix[rStart+1][cols-1])
        else
            return binarySearch(matrix, target, rStart + 1, cMid + 1, cols - 1); // line 51 & 50 are same...

    }
    }

