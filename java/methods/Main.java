package methods;
import java.util.Scanner;
class algebra {
    int add(int a,int b){
        return a+b;
    }
}   
public class Main{
    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            algebra obj = new algebra();
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("sum of number is ");
               int ans=obj.add(x,y);
               System.out.println(ans);
        }
        
    }
}