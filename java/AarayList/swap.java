package AarayList;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,21,31,41,51};
        swaps(arr,2,4);   // 2 and 4 are the index number of array
        System.out.println(Arrays.toString(arr));
    }  
    static void swaps(int[] arr,int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
