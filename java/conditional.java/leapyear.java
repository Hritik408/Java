import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the year");
            int y=sc.nextInt();
            if(y%400==0||y%100!=0&&y%4==0)
            System.out.println("number is leap year");
            else 
            System.out.println("number is not leap year");
        }
       }
}
