package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;
public class passingfun {
    public static void main(String[] args) {
    //     int[] num = {1,3,2,5,6};
    //     System.out.println(Arrays.toString(num));
    //     change(num);
    //     System.out.println(Arrays.toString(num));
    // }   static void change(int[] arr){
    //     arr[2] =23;
    // } 
    try(Scanner in = new Scanner(System.in)){
    int[][] arr = new int[3][3];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]= in.nextInt();
        }}
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }  System.out.println();  }

        // for(int i=0;i<arr.length;i++)
        // System.out.println(Arrays.toString(arr[i]));

        for(int[] a:arr)
       System.out.println(Arrays.toString(a));
        
    }
    }}
