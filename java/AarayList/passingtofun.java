package AarayList;
import java.util.Arrays;
import java.util.Scanner;
public class passingtofun {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int[] arr = {2,1,3,4};
            System.out.println(Arrays.toString(arr));
            change(arr);
            System.out.println(Arrays.toString(arr));
        }
    }  static void change(int[] arr){
        arr[0] = 10;
    }
}
