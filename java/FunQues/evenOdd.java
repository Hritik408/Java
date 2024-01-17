package FunQues;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
        //    int n = in.nextInt();
       //     find(n);
       int a = in.nextInt();
       int b = in.nextInt();
       int ans = sum(a,b);
       System.out.println(ans);
        }
    }   static void find(int n){
        if(n%2==0) System.out.println("no is even");
        else System.out.println("no is odd");
    }   static int sum(int a, int b){
        return a*b;
    }
}
