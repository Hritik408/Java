package LinearSearch;
public class max2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,-11,10},
            {2,31,8},
            {4,7,9,12}
        }; 
        System.out.println(max(arr));   // maximum element in two  d array
        System.out.println(min(arr));
    } 
      static int max(int[][] nums){
        int max = nums[0][0];
        for(int i=0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                if(nums[i][j]>max) max = nums[i][j];
            }
        }  return max;
    }  
    static int min(int[][] nums){
        int min = Integer.MAX_VALUE;
        for(int[] ints : nums){
            for(int element :ints){
                if(element < min)  min = element;
            }
        }   return min;
    }
}
