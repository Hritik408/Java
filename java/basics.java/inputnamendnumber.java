import java.util.Scanner;
public class inputnamendnumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the name");
            String a=sc.nextLine();
            System.out.println("the name is "+a);
            System.out.println("enter the number");
            float n=sc.nextFloat();
            System.out.println("the number is " +n);
        }

    }
}
