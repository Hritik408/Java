package LinearSearch;
import java.util.Arrays;
public class stringSearch {
    public static void main(String[] args) {
        String nums = "Rohan";          // [] not use after String
        char target = 'o';
   //     System.out.println(search(nums,target));
   System.out.println(Arrays.toString(nums.toCharArray()));   // letter in word in array form

    }  static boolean search(String str,char target){
        if(str.length()==0)  return false;         // () bcz in string str is function or method not variable
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i))  return true;
        }
         return false;
    }
}


