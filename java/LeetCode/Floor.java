package LeetCode;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 11;
        int ans = binaryseach(arr,target);
        System.out.println(ans);
        // floor  of a number..  greatest no <=target..
    }   static  int binaryseach(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
                if(target<arr[start])  return -1;
        while(start<=end){
          int    mid = start+(end-start)/2;
            if(target==arr[mid])  return mid;
            if(arr[mid]<target)  start=mid+1;
            else if(arr[mid]>target) end = mid-1;
        
        }   return arr[end];
    }
}
