package Sorting;
import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        int[] arr = {3,5,2,4,1,32,-1,0,9,10,8};    // complexity is 0(N*logN)
          //    int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(arr)));
    }  
    static int[] mergesort(int[] arr){   // 5 4 3 2 1
        if(arr.length==1) return arr;
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));  //  5 4
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));    // 3 2 1
        return merge(left,right);
    }  
       private static int[] merge(int[] first,int[] second){
        int i =0;
        int j =0;
        int k =0;
    
        int[] mix = new int[first.length+second.length];
        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
            mix[k] = first[i];
            i++;
        }   else{
            mix[k] = second[j];
            j++;}
            k++;
        } 
          // it may be possible that one of the arrays is not complete
        while(i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        } while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }    
        return mix;
    }
}
