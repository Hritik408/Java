package hackerrank;

import java.util.Scanner;


public class ques1 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            // int count = 1;
            // while(in.hasNextInt()){
            //     System.out.println(count+" "+in.nextLine());
            //     count++;
            // }
            // in.close();
            int b = in.nextInt();
            int h = in.nextInt();
            if(b<=0||h<=0) 
             System.out.println("java.lang.Exception: Breadth and height must be positive");
            else{
                int a=b*h;
                System.out.println(a);
            }
        }
    }
    
}
