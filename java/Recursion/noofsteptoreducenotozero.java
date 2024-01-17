package Recursion;

public class noofsteptoreducenotozero {
    public static void main(String[] args) {
        System.out.println(count(14));
    } 
     static int count(int n){
        return helper(n,0);
    }  
     static int helper (int n,int c){   
        if(n==0)  return c;
        int even = n%2;
        if(even == 0)  return helper(n/2, c+1);
        else return helper(n-1, c+1);
    }
}
