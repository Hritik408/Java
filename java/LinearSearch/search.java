package LinearSearch;

public class search {
    public static void main(String[] args) {
        int[] nums = {1,2,-11,10,7,18,30};
        int target = 18;
        int ans = linear(nums,target);
        System.out.println(ans);
        System.out.println(linear2(nums,target));
    }   static int linear(int[] arr,int target){
        if(arr.length==0) return -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target)  return i;
        }   return -1;    // if element is not found then print the index -1
    }   static boolean linear2(int[] arr,int target){
        if(arr.length==0) return false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target)  return true;
        }   return false;
    }
}
