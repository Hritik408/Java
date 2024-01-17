package LeetCode;

public class cealing{
    public static void main(String[] args) {
        int[] arr = {9,14,16,18};
        int target = 11;
        int ans = binaryseach(arr,target);
        System.out.println(ans);
        // cealing of a number..  smaller no >= to target
    }   static  int binaryseach(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(target>arr[arr.length-1])  return -1;
        while(start<=end){
          int mid = start+(end-start)/2;
            if(target==arr[mid])  return arr[mid];
            if(arr[mid]<target)  start=mid+1;
            else if(arr[mid]>target) end = mid-1;
        }   return arr[start];
    }
}
