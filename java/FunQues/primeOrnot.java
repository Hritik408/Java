package FunQues;
import java.util.Scanner;
public class primeOrnot {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            System.out.println(isprime(n));
        }
    }   static boolean isprime(int n){
         if(n<=1)  return false;
         for(int i = 2;i<n/2;i++){
            if(n%i==0)  return false;
         }  return true;
    }
}
