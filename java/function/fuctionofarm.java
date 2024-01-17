package function;

import java.util.Scanner;

public class fuctionofarm {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            // System.out.println("Enter the Number");
            // int n = in.nextInt();
            // System.out.println(armstrong(n));
            for(int i=100;i<=1000;i++){
                if(armstrong(i))
                System.out.print(i+" ");
            }
        }
    }    static boolean armstrong(int n){
        int l = n;
        int sum = 0;
        while(l>0){
            int d = l%10;
            sum+=d*d*d;
            l/=10;
        }
       return sum==n;
    }   
}
