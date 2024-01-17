package String;

import java.util.Arrays;

public class comparision {
    public static void main(String[] args) {
        String a = "hritik";
        String b = "hritik";
        System.out.println(a==b);
         String c = a;
         System.out.println(c==a);                    // object are stored in heap and primitive are stored in heap
        String name1 = new String("hritik");
       String name2 = new String("hritik");
       System.out.println(name1 == name2);
       System.out.println(name1.equals(name2));
       System.out.println(name1.charAt(0));
       System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));
       System.out.println(56);
    //   Integer num = new Integer(56);
  //     System.out.println(num.toString());
  //     System.out.println(num);
    }
}
