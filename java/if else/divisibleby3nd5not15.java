import java.util.Scanner;
public class divisibleby3nd5not15 {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the number" );
        int a=sc.nextInt();
        if(a%3==0||a%5==0){
            if(a%15!=0)
            System.out.println("number is not divisible by 3 and 5 but not 15");
            else 
            System.out.println("not matching condition");
           // System.out.println("number is divisible");
        }   else
         System.out.println("not matching condition");
    }

   }
    
}
