import java.util.Scanner;
public class table{
    public static void main(String[] args) {
        
         try (Scanner sc = new Scanner(System.in)){
            System.out.println("enter number");
            int n = sc.nextInt();
            System.out.println("enter how many times loop run");
            int a =sc.nextInt();
           // int r =0;
            for(int i=1;i<=a;i++){
             //   r =n*i;
                System.out.printf("%d*%d=%d\n",n,i,n*i);
            }
        }
    }
}