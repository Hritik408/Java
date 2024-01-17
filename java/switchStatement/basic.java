package switchStatement;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("enter fruit name");
            String fruit = in.next();
            switch(fruit){
                case "apple":
                System.out.println("king of fruit");
                break;
                case "grapes":
                System.out.println("small fruit");
                break;
                case "orange":
                System.out.println("round fruit");
                break;
                default:
                System.out.println("please enter valid fruit");
            } 
            System.out.println("please enter color name");
            String color = in.next();
            switch(color){
                case "red" -> System.out.println("it is reddish in color");
                case "pink" -> System.out.println("it is pinkish in colour");
                case "yellow" -> System.out.println("it is yellowish in color");
                default -> System.out.println("please enter correct color");
            }
            System.out.println("please enter a day number");
            int day = in.nextInt();
            switch(day){
                case 1 -> System.out.println("monday");
                case 2 -> System.out.println("tuesday");
                case 3 -> System.out.println("wednesday");
                case 4 -> System.out.println("thrusday");
                case 5 -> System.out.println("friday");
                case 6 -> System.out.println("saterday");
                case 7 -> System.out.println("sunday");
                default -> System.out.println("please enter valid week number");
           }
           System.out.println("enter week day");
            int days = in.nextInt();
            switch(days){
                case 1,2,3,4,5 -> System.out.println("weekday");
                case 6,7 -> System.out.println("weekend");
            }

        }
    }
}
