package LinearSearch;
public class searchName {
    public static void main(String[] args) {
        String[] name = {"hritik","yash","rohan","ayush"};
        String target = "yash";
       System.out.println(search(name, target));  // for index
       System.out.println(search1(name, target)); // for name
       System.out.println(search2(name, target));   // for true or false
     }  
     static int search(String[] str,String target){
        if(str.length==0)  return -1;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(target))  return i;
        }   return -1;
     }
      static String search1(String[] str,String target){  // String after static is for what kind of item is return if integer is return then int use if string item is return then string is use
        if(str.length==0) return null;      // is targer is not find then return null
        for(int i=0;i<str.length;i++){
            if(str[i].equals(target)) return str[i];
        }    return null; 
     }   
     static boolean search2(String[] str,String target){
        if(str.length==0)  return false;
        for(String item : str){
            if(item == target)  return true;
        }   return false;
     }  
}
