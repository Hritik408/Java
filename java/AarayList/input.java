package AarayList;
import java.util.Arrays;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
       //     int[] arr = new int[5];
       //     for(int i = 0;i<arr.length;i++){
       //         arr[i] = in.nextInt();
            
            // }  for(int i=0;i<arr.length;i++){
            //     System.out.print(arr[i]+" ");
      //      for(int num : arr){   // for every element in array, print the element
     //           System.out.print(num+" "); //here num represents element of the array
       //     }   
    //   System.out.print(Arrays.toString(arr));      // it is the best way to print the input
       String[] str = new String[4];
       for(int i=0;i<str.length;i++){
              str[i] = in.next();
       }     System.out.println(Arrays.toString(str));
            } 
        } }

        
    

