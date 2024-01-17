package BinarySearch;

public class Removeduplicate {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,3,2,5};
        for(int i =0;i<7;i++){
            for(int j = i+1;j<7;j++){
                if(arr[i]==arr[j]) continue;
            System.out.println(arr[j]);
            }
        // }    for(int i=0;i<7;i++){
        //     System.out.println(arr[i]);
        }
    }
}
