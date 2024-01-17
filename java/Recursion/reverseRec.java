package Recursion;

public class reverseRec {
    public static void main(String[] args) {
        System.out.println(rev(1234));         // this is for to reverse a number..
        System.out.println(palin(12321));     // this fun is for to check no is palindrome or not..
    }  
     static int rev(int n){
        int digit = (int)Math.log10(n)+1;  // it if for find no of digit here 4 digit is present..
        return helper(n,digit);
    } 
      static int helper(int n,int digit){
        if(n%10==n)  return n;
        int rem = n%10;
         return rem*(int)Math.pow(10, digit-1) + helper(n/10,digit-1);

    }   static boolean palin(int n){
         return n == rev(n);
    }
}
