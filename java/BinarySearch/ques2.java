package BinarySearch;

public class ques2 {
    public static void main(String[] args) {
    //    int[] arr= {4,5,6,7,0,1,2};
        int[] arr={1};
        int target = 1;
        int ans = search(arr,target);
        System.out.println(ans);
    }  static int search(int[] nums,int target){
       int k =-1;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==target) k=i;
        }  return k;
    }
}
