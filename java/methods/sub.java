package methods;
import java.util.Scanner;
class jaat{
    int minus(int x,int y){
        return x-y;
    }
}
public class sub {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            jaat fire = new jaat();    //here jaat is class and fire is obj.
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("the substruction is "+fire.minus(a,b));
    }
}
}
