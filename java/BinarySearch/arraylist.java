package BinarySearch;
import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
      try(  Scanner in = new Scanner(System.in)){
           ArrayList<Integer> list = new ArrayList<>(5);
        for(int i= 0;i<=5;i++)
        list.add(in.nextInt());
        for(int i=0;i<=5;i++)
        System.out.println(list.get(i));

      }
    //     ArrayList<Integer> list = new ArrayList<>(5);
    //      list.add(53);
    //      list.add(47);
    //      list.add(64);
    //      list.contains(47);
    // //     System.out.println(list.contains(47));
         
    //      System.out.println(list);
    //      list.set(1, 71);
    //     System.out.println(list);
    //      list.remove(1);
    //      System.out.println(list);
    }
}
