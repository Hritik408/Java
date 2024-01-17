package switchStatement;
import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int empId = in.nextInt();
            String department  = in.next();
        //   switch(empId){
        //     case 1:
        //     System.out.println("Rahul");
        //     break;
        //     case 2:
        //     System.out.println("rohan");
        //     break;
        //     case 3:
        //     System.out.println("id no 3");
        //     switch(department){
        //         case "it":
        //         System.out.println("IT department");
        //         break;
        //         case "ai":
        //         System.out.println("ai department");
        //         break;
        //         case "electrical":
        //         System.out.println("electrical department");
        //         break;
        //         default :
        //         System.out.println("please enter correct department");
        //     }  break;
        //     default:
        //     System.out.println("please enter valid empId");
        //   }
        // better way to write 
        switch(empId){
            case 1 -> System.out.println("rahul");
            case 2 -> System.out.println("rohan");
            case 3 -> {
                System.out.println("id no 3");
                switch(department){
                    case "it" -> System.out.println("it department");
                    case "ai" -> System.out.println("ai department");
                    case "electrical" -> System.out.println("electrical department");
                    default -> System.out.println("please enter correct department");
                }  
            }  
            default -> System.out.println("please enter correct id");
        }
        }
    }
}
