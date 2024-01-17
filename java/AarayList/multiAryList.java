package AarayList;
import java.util.Scanner;
import java.util.ArrayList;
public class multiAryList {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            // initialisation
            for(int i =0;i<3;i++){         
                   list.add(new ArrayList<>());    // if these two lines is not mentioned then elements will not be added in new list and list will be null
            }
             // add element
             for(int i =0;i<3;i++){
                for(int j =0;j<3;j++){
                    list.get(i).add(in.nextInt());
                }
             }   System.out.println(list);
        }
    }
}
