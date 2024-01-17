package Recursion;

public class ship {
    public static void main(String[] args) {
   //     skip("","cabdak");
   //     System.out.println(shipp("csddsd"));
        System.out.println(skipApple("cadapplekl"));
    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
             skip(p,up.substring(1));
        } 
        else skip(p+ch,up.substring(1));
    }  

    public static String shipp(String up){
        if(up.isEmpty()){
            return " ";
        } 
        char ch = up.charAt(0);
        if(ch == 'd'){
            return shipp(up.substring(1));
        }
        else {
            return ch + shipp(up.substring(1));
        }
    } 

    public static String skipApple(String up){
        if(up.isEmpty()){
            return " ";
        } 
        char ch = up.charAt(0);
        if(up.startsWith("apple"))  return skipApple(up.substring("apple".length()));
        else return ch + skipApple(up.substring(1));
    }
}
