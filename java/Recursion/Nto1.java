package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
     //   revfun(5);
     //   funboth(5);
    }  static int fun(int n){
        if(n==0) return 1;
       System.out.println(n);
      return  fun(n-1);   
    }  static void revfun(int n){
        if(n==0) return;
        revfun(n-1);
        System.out.println(n);
    }  static void funboth(int n){
        if(n==0) return;
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
}
