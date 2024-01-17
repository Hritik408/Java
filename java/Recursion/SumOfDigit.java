package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
      System.out.println(sod(1575));
        System.out.println(sod2(1212));
        System.out.println(pod(1234));
    }  static int sod(int n){
        if(n==1)  return 1;
        int sum =0;
        while(n!=0){
            int d = n%10;
             sum+=d;
            n/=10;
        }  return sum;
    }   static int sod2(int n){
        if(n==0)  return 0;
        return n%10 + sod2(n/10);
    }     static int pod(int n){
        if(n%10==n) return n;
        return n%10 * pod(n/10);
    }
}
