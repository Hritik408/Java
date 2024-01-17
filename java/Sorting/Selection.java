package Sorting;
import java.util.Arrays;
public class Selection {
   
    public static void main(String[] args) {
        int[] arr={2,3,0,20,-1};
        selection(arr);   // change last index from greatest integer index.
        System.out.println(Arrays.toString(arr));
    }   
    static void selection(int[] arr){
        for(int i =0;i<arr.length;i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr,lastIndex,maxIndex);
        }
    }    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;   // let max variable ko starting ki index de di..
        for(int i = start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }   return max;
    }     static void swap(int[] arr,int lastIndex,int maxIndex){
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex]  = temp;
    }
}
