package Recursion;
import java.util.ArrayList;
public class subset {
    public static void main(String[] args) {
    //    subset(" ", abc);
      System.out.println(subset2ascii("","abc"));
    }
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }   
        char ch = up.charAt(0);
          subset(p+ch, up.substring(1)) ;  // in lha add it and rhs ignore it..
          subset(p,up.substring(1));
    } 
    static ArrayList<String> subset2ascii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        } 
        char ch = up.charAt(0);
        ArrayList<String> first = subset2ascii(p+ch,up.substring(1));
        ArrayList<String> second = subset2ascii(p,up.substring(1));
        ArrayList<String> third = subset2ascii(p+(ch+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    //     right.addAll(left);
    //     return right;
    // }
    }}
