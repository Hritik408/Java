package NumberSystems;

import java.util.Scanner;

public class lessThanNisprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0)  continue;
            System.out.println(i);  
        }
    }
}
