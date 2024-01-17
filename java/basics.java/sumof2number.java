import java.util.Scanner;

public class sumof2number {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter first number");
        int num_1=sc.nextInt();
        System.out.println("enter second number");
        int num_2=sc.nextInt();
        int sum=num_1+num_2;
   System.out.println("the sum of two number is "+sum);
      }

      
    }
}
