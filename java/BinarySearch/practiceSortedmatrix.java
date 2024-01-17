package BinarySearch;
public class practiceSortedmatrix {
    public static void main(String[] args) {
        
    }   static int[] binarySearch(int[][] matrix,int target, int rStart, int cStart,int cEnd){
        while(cStart<cEnd){
            int cMid = cStart+(cEnd-cStart)/2;
            if(target==matrix[rStart][cMid])  return new int[]{rStart,cMid};
            if(target<matrix[rStart][cMid])    cEnd = cMid-1;
            else cStart = cMid+1;
        }  return new int[]{-1,-1};
    }     static int[]   search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1)  
        return binarySearch(matrix, target, 0,0, cols-1);
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols/2;
        while(rStart<rEnd-1){
           int mid = rStart+(rEnd-rStart)/2;
           if(target<matrix[cMid][mid])   rEnd = mid;
           else rStart= mid;
        }     
        if(matrix[rStart][cMid]==target)   return new int[]{rStart,cMid};
        if(matrix[rStart+1][cMid]==target)   return new int[]{rStart+1,cMid};
        if(matrix[rStart][cMid-1]>=target)   
        return binarySearch(matrix, target, rStart,0, cMid-1);
        else if(matrix[rStart][cMid+1]<=target && target<=matrix[rStart][cols-1]);
        return binarySearch(matrix , target, rStart, cMid+1, cols-1);
      //  if(matrix[rStart][cMid-1]>=target) 
    }
}  
