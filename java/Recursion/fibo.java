package Recursion;

public class fibo {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
      for (int i = 0; i < 11; i++) {
    //    System.out.println(fiboformula(i));
      }
      System.out.println(fiboformula(50));
    }   static int fiboformula(int n){
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5)));
    }
     static int fibonacci(int n){
        if(n<2)  return n;
       return  fibonacci(n-1) + fibonacci(n-2);    // linear
    
    }
}
