package StackandQueue;

public class firstSmallerRight {
    public static void main(String[] args) {
        int[] arr = {10,13,18,15,20,18,25,12,15,6,10,8};
        int[] ans = new int[50];
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    ans[i] = arr[j];
                    break;
                }
                else{
               String min = "123";
                ans[i] = Integer.parseInt(min);
                }
            }
        }

        for(int i =0;i<arr.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
