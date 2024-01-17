package Recursion.Array;
import java.util.ArrayList;
public class SearchNO {
    public static void main(String[] args) {
        int[] arr = {3,2,9,18,18,10};
        int target = 18;
        System.out.println(search(arr,target,0));

        System.out.println(findInd(arr,target,0));

        System.out.println(findfromlast(arr,target,arr.length-1));

        findAllIndex(arr,target,0);
         System.out.println(list);   // here only one time will be print..

          System.out.println(findList(arr,target,0,new ArrayList<>()));  // ***** good one  new arrylist<>() is obj which remains same throughout
          ArrayList<Integer> ans = findList(arr,target,0,new ArrayList<>());   // just above is same findlist()..
          System.out.println(ans);
      //    ArrayList<Integer> list = new ArrayList<>();
      //    System.out.println(list);
        System.out.println(findAllIndex2(arr,target,0));

        }  
        static boolean search(int[] arr,int target,int index){   // this is for check no is present or not
        //   if(arr[index] == target)  return true;
         if(index == arr.length)  return false;
            return  arr[index]==target || search(arr, target, index+1);
        } 
         static int  findInd(int[] arr,int target,int index){      // find index from starting of the array..
            if(index == arr.length)  return -1;
            if(arr[index]==target)  return index;
           else return findInd(arr, target, index+1);   // without else will be true..
        }
        static int findfromlast(int[] arr,int target,int index){     // find index from the last of the array..
            if(index == -1)  return -1;
            if(arr[index]==target)  return index;
            return findfromlast(arr, target, index-1);
        }  
         static ArrayList<Integer> list = new ArrayList<>();
        static void findAllIndex(int[] arr,int target , int index){   // index of both same together..
            if(index == arr.length)  return;
            if(arr[index]==target)  list.add(index);
            findAllIndex(arr, target, index+1);
        //    System.out.println(list);    not use here bcz we want only one time both index if we use here then mutiple times list print so above in main should be print
        }   
        static ArrayList<Integer> findList(int[] arr,int target,int index,ArrayList<Integer> list){   
            if(index == arr.length)  return list;
            if(arr[index] == target)  list.add(index);
            return findList(arr, target, index+1, list);
        }   
        static ArrayList<Integer>  findAllIndex2(int[] arr,int target,int index){
            ArrayList<Integer> list = new ArrayList<>();   // here for every fun new list is formed..
            if(index == arr.length)  return list;
            // this will contain ans for that function call only..
            if(arr[index] == target)  list.add(index);
            ArrayList<Integer> ansFrombelowList = findAllIndex2(arr, target, index+1);
            list.addAll(ansFrombelowList);
            return list;
        }
}
