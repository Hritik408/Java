import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        try (Scanner cc = new Scanner(System.in)) {
            System.out.println("enter principle");
            float p=cc.nextFloat();

            System.out.println("enter rate of interest");
            float r=cc.nextFloat();

            System.out.println("enter time");
            float t=cc.nextFloat();
            
            float si=(p*r*t)/100;
            System.out.println("principle "+p);
            System.out.println("rate of interests "+r);
            System.out.println("time"+t);
            System.out.println("simple interest "+si);
        }
    }
    
}
