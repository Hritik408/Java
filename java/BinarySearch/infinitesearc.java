package BinarySearch;

public class infinitesearc {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,190,200,214,563};
        int target = 563 ;
        int ans = binaryseach(arr,target);
        System.out.println(ans);
        // it is the case of when elements in ascending order..
    }   static  int binaryseach(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
          //  start = end+1;
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
            
        }   int sol=range(arr,target,start,end);
          return sol;
    }  static int range(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target)  start=mid+1;
            else if(arr[mid]>target) end = mid-1;
            else  return mid;
        }    return -1 ;
    }
}
