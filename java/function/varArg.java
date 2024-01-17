package function;
import java.util.Arrays;
public class varArg {
    public static void main(String[] args) {
     //   fun(2,3,4,5,2,3,6,8,99);
      //  nam("ritik","rohan","ayush","harsh");
        multiple(2,4,"yash","urvashi","karan","aman");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void nam(String ...dil){    // ...any name without space for infinite things
        System.out.println(Arrays.toString(dil));
    }
    static void multiple(int a,int b,String ...s){   // variable argument always lies in last
     //   System.out.println(Arrays.toString(a+" "+b+" "+s));
     //   System.out.println(a+" "+b+" "+s);
     System.out.println(Arrays.toString(s));
    }
}
