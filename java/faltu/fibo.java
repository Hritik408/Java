package faltu;

public class fibo {
    public static void main(String[] args) {
        int n = 3;
        oneToN(n);
     //   System.out.println(res);
    }  
    static void oneToN(int n){
            if(n==0) return;
     //   System.out.println(n);
       oneToN(n-1);
       System.out.println(n);

    }
}  

// public class fibo {
//      public static void main(String[] args) {
//         int num1 = 2;
//         int num2 = 4;
//     //    int ans = 1;
//     //     for(int i =1;i<=num2;i++){
//     //     ans = ans*num1;
//     //     }  
//     //     System.out.println(ans);

//        int result = gcd(num1, num2);
//     System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
//     }
//     public static int gcd(int a, int n) {
//         if(n==0) return 1;
//         if(n % 2 == 0){
//             return gcd(a,n/2) * gcd(a,n/2);
//         }
//         else{
//             return a * gcd(a, n/2) * gcd(a, n/2);
//         }
//     }
// }


