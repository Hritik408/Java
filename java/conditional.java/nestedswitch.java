import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int empId  = in.nextInt();
            String department=in.next();
          //  switch(empId){
                // case 1:
                // System.out.println("Hritik Chaudhary");
                // break;
                // case 2:
                // System.out.println("Yash Poonia");
                // break;
                // case 3:
                // System.out.println("emp no 3");
                // switch(department){
                //     case "IT" :
                //     System.out.println("IT department");
                //     break;
                //     case "AI":
            //         System.out.println("AI department");
            //         break;
            //         default:
            //         System.out.println("enter correct department"); 
            //     } break;  case 4:
            //     System.out.println("Ritika Sarawat");
            //     break;
            //     default:
            //     System.out.println("enter correct id");
            // }
            switch(empId){
                case 1 -> System.out.println("Hritik Chaudhary");
                case 2 -> System.out.println("Yash Poonia");
                case 3 ->{ System.out.println("emp no 3");
                  switch(department){
                    case "IT" -> System.out.println("it department");
                    case "AI" -> System.out.println("ai department");
                    default -> System.out.println("invalid deaptment");
                  } }
                  case 4 -> System.out.println("Ritika sarawat");            
            default -> System.out.println("enter valid id");
       }
    } } }

