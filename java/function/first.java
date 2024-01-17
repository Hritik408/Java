package function;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Please enter the name");
            String name = in.nextLine();
        String message = mygreet(name);
        System.out.println(message);
    }   
}
    static String mygreet(String name){
        String ans = "Hello "+name;
        return ans;
    }
      
}
