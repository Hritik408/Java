package BinarySearch;
import java.util.Scanner;
public class searchele {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int[] arr={1,2,3,5,6};
            int target = 1;
            int find=search(arr,target,0,3);
            System.out.println(find);
        }   
    }   static int search(int[] arr, int target ,int start,int end){
        if(arr.length==0) return -1;
        for(int i=start;i<end;i++){
            int element = arr[i];
            if(element==target)
         return arr[i];
         //   return i;
        }
        return -1;
    }
}
