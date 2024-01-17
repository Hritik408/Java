package Recursion;
public class StringSkip {
    public static void main(String[] args) {  // with the help of skip4 we can solve both singe word and letter
     //   char target = 'c';
     String target = "apple";
 //       skip("","baccdah",target);
    //    System.out.println(skip2("baccdah",target));
     //   System.out.println(skip3("baachhl"));
        System.out.println(skip4("bcappleakl",target));

    }  
    static void skip(String p,String up,char target){
        if(up.isEmpty())  {
            System.out.println(p);
            return;
        }  
        char ch = up.charAt(0);    // in every call ch will at 0th index
        if(ch==target){
            skip(p,up.substring(1),target);
        } else{
            skip(p+ch, up.substring(1),target);
        }
    }  
    static String skip2(String up,char target){
        if(up.isEmpty()){
            return "";
        }  
        char ch = up.charAt(0);
        if(ch==target){
         return   skip2(up.substring(1),target);
        }  else{
            return ch+skip2(up.substring(1),target);
        }
    }  
    static String skipapple(String up){
        if(up.isEmpty())   return "";
        if(up.startsWith("apple")){
         return   skipapple(up.substring(5));
        }  else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }    
    static String skip3(String up){
        if(up.isEmpty())  return "";
        if(up.startsWith("a"))  return skip3(up.substring(1));
        else return up.charAt(0) + skip3(up.substring(1));
    }
    static String skip4(String up,String target){   // this is important one..
        if(up.isEmpty())  return "";
        if(up.startsWith(target))  return skip4(up.substring(target.length()),target);
        else return up.charAt(0) + skip4(up.substring(1),target);
    }
}
