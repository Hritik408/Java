package BinarySearch;

public class RotatingBS {
   public static void main(String[] args) {
         int[] arr = {5,6,7,8,9,1,2,3};
         int max = search(arr, 7);
         System.out.println(max);

   }  static int search(int[] nums,int target){
         int pivot = findpivot(nums);   // concept of pivot is use only in rotating binary search
         if(pivot==-1){
            // just do normal binary search.
            return binarysearch(nums, target,0,nums.length-1);
            
         }
         // if pivot is found then 
         // Case 1:
         if(nums[pivot]==target)  return nums[pivot];
         // Case 2:
     //    if(target<=nums[0]) 
      //    return binarysearch(nums,target,pivot+1,nums.length-1);
         // Case 3: 
         if(target>=nums[0])  return binarysearch(nums,target,0,pivot-1);
         return binarysearch(nums,target,pivot+1,nums.length-1);  // target<=nums[0]
       //  return -1;
   }  
    static int  binarysearch(int[] arr,int target,int start,int end){
    while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid]==target)  return mid;
        if(arr[mid]<target)  start=mid+1;
     //   else if(arr[mid]>target) end = mid-1;
           else end = mid-1;
    }   return -1;
   }

    static int findpivot(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start+(end - start)/2;
        // Case 1:
        if(mid<end && arr[mid]>arr[mid+1])  return mid;
        // Case 2:
        if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
        // Case 3:
        if(arr[start]>=arr[mid])   end = mid-1;
        // Case 4:
        if(arr[start]<=arr[mid])  start= mid+1;
    }     return -1;
   }
}
