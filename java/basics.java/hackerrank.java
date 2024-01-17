import java.util.Scanner;
public class hackerrank {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int t = sc.nextInt();
            for(int j=0;j<t;j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int k=a;
            int l=1;
            for(int i=1;i<=n;i++){
               k+=l*b;
          System.out.print(k+" ");
          l*=2; 
            }System.out.println();
        }}
    }
}
