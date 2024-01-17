package AarayList;
import java.util.Scanner;
import java.util.Arrays;
public class stringINput {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            String[][] str = new String[3][3];
            for(int row =0;row<str.length;row++){
                for(int col =0;col<str[row].length;col++){
                 str[row][col] = in.next();
                }
            }   
            // for(String[] a:str){                     //      output
            //     System.out.println(Arrays.toString(a));
            // } 
            for(int row = 0;row<str.length;row++){
                System.out.println(Arrays.toString(str[row]));    // output
            }
        }
    }
}
