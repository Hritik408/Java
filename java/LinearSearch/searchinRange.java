package LinearSearch;

public class searchinRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,29};
        int target  = 3;
        System.out.println(search(arr,target,0,2));
    }  
    static int search(int[] nums,int target,int si,int ei){
        if(nums.length==0)  return -1;
        for(int i=si;i<=ei;i++){
            if(target == nums[i])  return i;
        }  return -1;
    }
}
