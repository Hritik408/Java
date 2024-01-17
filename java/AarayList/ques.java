package AarayList;
import java.util.Arrays;

public class ques {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        suffle(arr);
      //  System.out.println(sol);
    }   
    static void suffle(int[] arr){
        int[] ans = new int[arr.length];
        for(int i =0;i<arr.length/2;i=i+1){
            ans[i] = arr[i];
            ans[i+1] = arr[i+arr.length/2];
        }      for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
