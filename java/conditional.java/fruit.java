 import java.util.Scanner;
 public class fruit {
    public static void main(String[] args) {
       try(Scanner in =new Scanner(System.in)){
    //  System.out.println("Enter fruit name");
    //   String fal = in.nextLine();
    //    if(fal.equals("mango"))
    //    System.out.println("king of fruits");
      //  switch(fal){
      //   case  "mango" -> System.out.println("kings  of fruit");
      //   case  "grapes" -> System.out.println("sour in taste");
      //   case  "chiku" -> System.out.println("not widely used");
      //   case  "apple" -> System.out.println("doctor's choise");
      //   case  "watermelon" -> System.out.println("summer king");
      //   default -> System.out.println("invalid input");
      //  }
      int n=in.nextInt();
      switch(n){
        case 1,2,3,4,5 -> System.out.println("Week days");
        case 6,7 -> System.out.println("Weekend");   
      }
       
        }
    }
    }
