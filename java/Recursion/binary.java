package Recursion;
public class binary {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,10};
        int target = 2;
        System.out.println(search(arr, target, 0, arr.length-1));
    } 
     static int search(int[] arr,int target,int start ,int end){
        if(start>end)  return -1;
          int mid = start + (end-start)/2;
          if(arr[mid] == target)  return mid;
          if(arr[mid]<target)   return search(arr, target, mid+1, end);
          return search(arr, target, start, mid-1);
            // divide and conquer
    }
}
