import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("enter the number");
            int i=sc.nextInt();
            if(i%2==0)
            System.out.println("number is even");
            else System.out.println("number is not even");
        }
    }
}

