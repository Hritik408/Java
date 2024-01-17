package function;
import java.util.Scanner;
public class armstrong {
      public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter starting Number");
           int a = in.nextInt();
           System.out.println("Enter ending Number");
           int b = in.nextInt();
            for(int i = a;i<b;i++){
           if(IsArm(i))
            System.out.print(i + " ");
        }
        }
      }   static boolean IsArm(int k){
         int sum = 0;
       int l =k;
        while(l!=0){
            int d = l%10;
            sum+=d*d*d;
            l/=10;
        }   
        return k==sum;      // if it is not true return false       
      }
}
