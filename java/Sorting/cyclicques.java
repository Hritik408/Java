package Sorting;

 import java.util.Arrays;

public class cyclicques {
    public static void main(String[] args) {
        int[] arr= {1,0,3,4};   
    // int ans =   ques(arr);
       System.out.println(Arrays.toString(arr));
 //   System.out.println(ans);
    }    static void  ques(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct  = arr[i];
            if( i!= correct){
                swap(arr,i,correct);
            }   else i++;
        }
      
    }     static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] =  arr[second];
        arr[second] = temp;
    }
}
