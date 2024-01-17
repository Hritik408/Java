package Sorting;
import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
         int[] arr= {-1,5,7,0,-23,9,10,-20};
          bubble(arr);
           System.out.println(Arrays.toString(arr));
    }   
    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            } // if you not swapped for a particular value of i it means array is sorted and stop the program
              if(!swapped)     break;
        }
    }
}
