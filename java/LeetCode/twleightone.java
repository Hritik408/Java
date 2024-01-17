package LeetCode;
import java.util.Scanner;
public class twleightone {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int n = in.nextInt();
            int a = ans(n);
            System.out.println(a);
        }
    }  
    static int ans(int n){
            int sum = 0;
            int prod = 1;
            while(n!=0){
                int d = n%10;
              sum+=d;
              prod*=d;
              n/=10;
            }
            return prod-sum;  
    }
}
