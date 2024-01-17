package BinarySearch;
import java.util.Arrays;
public class search2d {
    public static void main(String[] args) {
        int[][] arr={{1,-2,5,43},{1,61},{3,7},
                      {4,2},{3,4,30,235},
                      {20,4},{3,41},{2,3}
                          };
          int target = 235;
          int ans[] = search(arr,target);
          System.out.println(Arrays.toString(ans));
          System.out.println( "Maximum element is "+max(arr));
          System.out.println("Minimun element is "+min(arr));
    }   static int[] search(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target)
            return new int[]{i,j};
        } }                    
        return new int[]{-1,-1};
    }  static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] i:arr){
            for(int j:i){
                if(j>max)
                max=j;
            }
        }   return max;
    }    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] ints:arr){
         for(int element:ints){
            if(element<min)
            min=element;
         }   
        }   return min;
    }
     
}
