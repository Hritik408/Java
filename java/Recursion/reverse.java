package Recursion;

public class reverse {
    public static void main(String[] args) {
        System.out.println(rev1(3));
    
    }
    static int rev1(int n){
        int r = 0;
        while(n!=0){
            int d = n%10;
            r = r*10+d;
           n= n/10;
        }  return r;
    }    
   
}
