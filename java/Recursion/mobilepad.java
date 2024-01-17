package Recursion;

import java.util.ArrayList;

public class mobilepad {
    public static void main(String[] args) {
    //    mobile("", "12");
        System.out.println(moblist("","12"));
    }

    static void mobile(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '3' into 3
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            mobile(p + ch, up.substring(1));
        }
    }   
    static ArrayList<String> moblist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }  
         int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3;i>digit*3;i++){
            char ch = (char)('a'+i);
            list.addAll(moblist(p+ch, up.substring(1)));
        }   
        return list;
    }
}
