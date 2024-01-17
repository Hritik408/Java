import java.util.Scanner;
public class firstprogram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           // System.out.println("enter a word");
            System.out.println( "enter the word index");
            int x=sc.nextInt();
         System.out.println("enter the word");
           char ch=sc.next().charAt(x);
           System.out.println("the character at index is "+ch);
        }
       }
}
