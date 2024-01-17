import java.util.Scanner;
public class takeinput {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your name");
            String ab=sc.nextLine();
            System.out.println("the name is "+ab);

            System.out.println("enter your lucky number");
            int x=sc.nextInt();
            System.out.println("the lucky no is "+x);
        }
    
    }
    }
    

