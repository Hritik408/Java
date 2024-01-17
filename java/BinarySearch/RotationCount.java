package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
         int[] arr= {4,5,6,7,8,1,2,3};
     //     int[] arr={1,2,3,4,5,6,7,8};
        int ans = countRotation(arr);
        System.out.println(ans);
    }   static int countRotation(int[] arr){
        int ans = findPivot(arr);
        return ans+1;
    }   static int findPivot(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && mid<end)   return mid;
            if(arr[mid]<arr[mid-1] && mid>start)   return mid-1;
            if(arr[start]>arr[mid])  end = mid-1;
           // if(arr[start]<arr[mid])  start = mid+1;
           else start = mid+1;
        }    return -1;

    }
}
