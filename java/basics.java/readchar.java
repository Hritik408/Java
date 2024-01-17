import java.util.Scanner;
public class readchar {
    public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        System.out.println("enter the name");
        char ch=s.next().charAt(5);
        System.out.println("character is "+ch);
    }
}
}
