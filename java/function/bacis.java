package function;
import java.util.Arrays;
public class bacis {
    // public static void main(String[] args) {
    
    //    String mess= gret();
    //    System.out.println(mess);
    // }
    //   static String gret(){
    //     String gretting = "how are you mr hritik";
    //     return gretting;
    //   }
    // 
    // public static void main(String[] args) {
    //     try(Scanner in = new Scanner(System.in)){
    //      System.out.println("enter first no");
    //      int a = in.nextInt();
    //      System.out.println("enter second no");
    //      int b = in.nextInt();
    //      int add=sum(a,b);
    //      System.out.println(add);
    //     }
    // }
    // static int sum(int x,int y){
    //     return x+y;
    // }
     public static void main(String[] args) {
        int arr[]={1,34,2,3,23};
      //  change(arr);
        System.out.println(Arrays.toString(arr));
     }
     static void change(int [] nums){
        nums[0]=99;
     }
}