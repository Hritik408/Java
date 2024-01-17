package loops;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            int s=1;
          //  int f=a-1;
            for(int i=1;i<=a;i++){
                // for(int k=f;k>0;k--)
                // System.out.print(" ");
                // f--;

                //both method is good..
                
                for(int k=1;k<=a-i;k++)
                System.out.print(" ");
                for(int j=1;j<=s;j++){
                    System.out.print("*");
                } s+=2;
                  System.out.println();
            }

        }
    }
}
