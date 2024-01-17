package AarayList;
import java.util.Arrays;
import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int[][] arr = new int[3][3];
            System.out.println(arr.length);   // 3 ,length of array is equal to no of rows.
            // input
            System.out.println("Please enter the elements");
            for(int row =0;row<arr.length;row++){
                for(int col = 0;col<arr[row].length;col++){
                   arr[row][col] = in.nextInt();
                }  
            }   // output
            System.out.println("Your output is shown below:");
            //  for(int row =0;row<arr.length;row++){
            //     for(int col = 0;col<arr[row].length;col++){
            //        System.out.print(arr[row][col]+" ");
            //     }  System.out.println();  
            // } 
   //         for(int row =0;row<arr.length;row++){
   //             System.out.println(Arrays.toString(arr[row]));  // it is best 
   //         }  
            for(int[] a:arr){
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
