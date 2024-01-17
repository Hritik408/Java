package String;

public class palin {
    public static void main(String[] args) {
        String str = "abcdcba";
       boolean ans = ispalindrome(str);
       System.out.println(ans);
     //   System.out.println(ispalindrome(str));     this is also true.
    } 
      static boolean ispalindrome(String str){
        if(str.length()==0|| str==null)  return true;
     str = str.toLowerCase();
      // str = str.toUpperCase();
        for (int i = 0; i < str.length();i++) {
            char start =  str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start!=end)
            return false;
        }   return true;
    }
}
