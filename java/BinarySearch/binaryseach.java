package BinarySearch;

public class binaryseach {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1 ;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
        // it is the case of when elements in ascending order..
    }   static  int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target)  return mid;
            if(arr[mid]<target)  start=mid+1;
         //   else if(arr[mid]>target) end = mid-1;
         else end = mid-1;
            
        }   return -1;
    }

}
