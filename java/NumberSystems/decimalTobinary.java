package NumberSystems;
import java.util.Scanner;
public class decimalTobinary {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter decimal number");
            int n=sc.nextInt();
            int ans=0,r,pow=1;
            while(n!=0){
                r=n%2;
                ans=ans+r*pow;
                pow=pow*10;
                n=n/2;
            }  System.out.println("decimal to binary is "+ans);
        }
    }
}
