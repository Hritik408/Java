package LinearSearch;
import java.util.Arrays;
public class searchin2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,-11,10},
            {2,3,8},
            {4,7,9,12}
        };  
        int target = 12;
        int[] ans = search(arr,target);   // format of return value (row,column);
        System.out.println(Arrays.toString(ans));
    }   
    static int[] search(int[][] nums,int target){  // int[] shows that what will be return from this function
        if(nums.length==0)  return new int[]{-1,-1};
        for(int r=0;r<nums.length;r++){
            for(int c=0;c<nums[r].length;c++){
                if(target == nums[r][c])  
                return new int[]{r,c};
            }
        }   return new int[]{-1,-1};
    }
}
