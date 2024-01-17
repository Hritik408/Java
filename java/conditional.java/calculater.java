import java.util.Scanner;
public class calculater {
    public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter choise");
        int n=sc.nextInt();
         switch(n){
            case 1: 
            System.out.println("the addition is "+(a+b));
            break;
            case 2:
            System.out.println("the substruction is "+(a-b));
            break;
            case 3:
            System.out.println("the multiplication is "+(a*b));
            break;
            case 4:
            System.out.println("the divion is "+(a/b));
            break;
            case 5:
            System.out.println("the average is "+(a+b)/2);
            break;
            default:
            System.out.println("invalid input");
         }  
    }
        
    }
    
}
