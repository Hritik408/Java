package FunQues;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
        int ans = max(a,b,c);
        System.out.println("max no is "+ans);
         int sol =  min(a,b,c);
         System.out.println("min no is "+sol);
        }
    } 
    static int max(int a,int b, int c){
          if(a>b&&a>c)  return a;
          else if(b>a&&b>c)   return b;
          return c;
     }  
     static int min(int a, int b,int c){
        if(a<b&&a<c)  return a;
        else if(b<a&&b<c)  return b;
        return c;
     }
}
