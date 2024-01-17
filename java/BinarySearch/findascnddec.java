package BinarySearch;

public class findascnddec {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int target = 2;
        int ans = search(arr,target);
        System.out.println(ans);
    }  
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isasc = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
                if(target==arr[mid]) return mid;
            if(isasc){
                if(target<arr[mid]) end = mid-1;
                else start=mid+1;
            }   else{
                if(target<arr[mid])   start = mid+1;
                else end = mid-1;
            }  
        }   return -1;
    }
}
