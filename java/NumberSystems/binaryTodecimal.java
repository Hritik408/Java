package NumberSystems;
import java.util.Scanner;
public class binaryTodecimal {
    
    public static void main(String[] args) {
        try ( Scanner sc=new Scanner(System.in)){
              System.out.println("entre binary number");
            int binary_num = sc.nextInt();
            int d,ans=0,pow=1;
            while(binary_num!=0){
                d=binary_num%10;
                ans+=d*pow;
                pow*=2;
                binary_num/=10;
            }
             System.out.println("binary to decimal is "+ans);
          }
        }
    
}
