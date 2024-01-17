package FunQues;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter the number");
         int n = in.nextInt();
     //    int ans = fibo(n);
     //    System.out.println(ans);
     //   System.out.println(Arrays.toString(fibon(n)));
        fibon(n);
        }
    } 
    static int fibo(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        if(n==2)  return 1;
        for(int i = 1;i<=n-2;i++){
            sum = a+b;
            a = b;
            b = sum;
        }   return sum;
    }   
    static void fibon(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1;i<=n-2;i++){
            sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }   
    }
}
