package LinearSearch;

public class minNo {
    public static void main(String[] args) {
        int[] arr = {10,-12,81,0};
        System.out.println(min(arr));   // minimum element
        System.out.println(max(arr));   // maximum element
    }   
    static int min(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)  min = nums[i];
        }   return min;
    }  
    static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
        }    return max;
      }  
}
