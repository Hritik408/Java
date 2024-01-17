package Recursion;

public class factorial {
    public static void main(String[] args) {  
       System.out.println((fact(4)));
        System.out.println(sum(4));
    } 
     static int fact(int n){
        if(n==1)  return 1;
        return n*fact(n-1);
     } 
      static int sum(int n){
        if(n==1)  return 1;
        return n+sum(n-1);
     }
}
