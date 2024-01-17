package Recursion;

public class RBS {
  public static void main(String[] args) {
     //   int[] arr = {5,6,7,8,9,1,2,3};
        int[] arr ={4,5,6,1,2,3};
        System.out.println(search(arr,2,0,arr.length-1));
    }   
    static int search(int[] arr,int target,int s,int e){
        if(s>e)  return -1;    // s and e are the indexes..
        int mid = s+(e-s)/2;
        if(target == arr[mid]) return mid;
        if(arr[mid]>=arr[s]){  // when mid element greater than starting element
            if(target>=arr[s]&&target<=arr[mid])  return search(arr, target, s, mid-1);  // arr[s]<=target<=arr[mid]
            else  return search(arr, target, mid+1, e);
        } 
          if(target>=arr[mid] && target<=arr[e])  return search(arr, target, mid+1, e);    // arr[mid]<=target<=arr[e]
          else return search(arr, target, s, mid-1);
    }
}
