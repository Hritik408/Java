package NumberSystems;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter a number");
            int n = in.nextInt();
           for(int i =1;i<=n;i++){
            System.out.println( i + " " +isprime(i));
           }
        }
    }   
     static boolean isprime(int n){
        if(n<=1) return  false;
        int a = 2;
        while(a*a<=n){  // a is equal to the sqrt of n for reduse no of opretions
        if(n % a == 0)  return false;
        a++;
        }     return true ;
     }
}
