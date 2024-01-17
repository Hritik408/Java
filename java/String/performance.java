package String;

public class performance{
    public static void main(String[] args) {
    //    String series = "";
    StringBuilder builder  = new StringBuilder();
        for (int i = 0; i < 26; i++) {
     char ch = (char)('a'+i);
    // System.out.println(ch);
 //   series+=ch;
       builder.append(ch);
        }  
        // System.out.println(series);
        System.out.println(builder.toString());
        System.out.println(builder.deleteCharAt(0));
        builder.reverse();
        System.out.println(builder);
         }
}
