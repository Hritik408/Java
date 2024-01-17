package BinarySearch;
import java.util.Scanner;

public class linearsearch {
      public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter the name");
         String name = in.nextLine();
         System.out.println("Enter the target ");
         char target = in.charAt();
         System.out.println(search(name,target));
        }
      }
      static boolean search(String std, char target){
        if(std.length()==0)
        return false;
        for(int i=0;i<std.length();i++){
            if(target==std.charAt(i));
            return true;
        }
        return false;
      }
}
