package FunQues;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            System.out.println(ispalin(n));
        }
    } 
    static boolean ispalin(int n){
        int sum = 0;
        int l = n;
        while(l!=0){
            int d  = l%10;
            sum = sum*10+d;
            l/=10;
        }   
       return sum==n;
     }
}
