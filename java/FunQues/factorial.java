package FunQues;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            int ans = fact(n);
            System.out.println(ans);
        }
    }   static int fact(int n){
        int  p = 1;
        for (int i = n; i>=1; i--) {
            p*=i;
        }  return p;
    }
}
