package BinarySearch;
 import java.util.Arrays;
import java.util.Scanner;
public class basic {
public static void main(String[] args) {
  try(Scanner in = new Scanner(System.in)){
  //  int[] arr= new int[5];
  //  for(int i=0;i<arr.length;i++){
    //    arr[i]=in.nextInt();
   // }
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
  //  for(int num:arr){  //for every element in array print that element
  //      System.out.print(num+" ");  //here num represents elements of array
  //  }
 // System.out.print(Arrays.toString(arr));

    String[] str= new String[5];
    for(int i=0;i<str.length;i++)
        str[i]=in.nextLine();

       System.out.print(Arrays.toString(str));
        str[3]="jalalabad";
        System.out.println(Arrays.toString(str));
  }
    
}
}
