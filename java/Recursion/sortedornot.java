package Recursion;

import java.util.ArrayList;
public class sortedornot {
    public static void main(String[] args) {
        int[] arr = {2,4,6,6,8};
    //   System.out.println(sort(arr,0));
    //   System.out.println(check(arr,8,0));  
    //   System.out.println(findind(arr,8,0)); 
    //   findallindex(arr,6,0);
    //   System.out.println(list);
    //  ArrayList<Integer> ans = findAllindex(arr, 6, 0, new ArrayList<>());
     //  System.out.println(findAllindex(arr, 6, 0,new ArrayList<>()));
    //   System.out.println(ans);
       System.out.println(findallIndex2(arr,6,0));

    }  
    static boolean sort(int[] arr,int index){
        if(index==arr.length-1)  return true;
        return arr[index]<arr[index+1]&&sort(arr,index+1);
    }  
     static boolean check(int[] arr,int target ,int i){
        if(i==arr.length)  return false;  // index out of bound
           return arr[i]==target||check(arr, target,i+1);
    }  
    static int findind(int[] arr,int target ,int index){
        if(index==arr.length) return -1;
        if(arr[index]== target )  return index;
        return findind(arr, target, index+1);
    }   
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr,int target,int index){
        if(index == arr.length)  return ;
        if(arr[index]== target)  list.add(index);
        findallindex(arr, target, index+1);
    //    System.out.println(list);   if it is present here then 5 times index print because after finish every fun index will print
    }  
    static ArrayList<Integer> findAllindex(int[] arr,int target, int index,ArrayList<Integer>list){
        if(index==arr.length)  return list;
        if(arr[index]==target)  list.add(index);
        return findAllindex(arr, target, index+1, list);
    }  
    static ArrayList<Integer> findallIndex2(int[] arr,int target ,int index){
          ArrayList<Integer> list = new ArrayList<>();
            if(index == arr.length)  return list;
            // this will contain ans for that function call
            if(arr[index]==target)  list.add(index);
            ArrayList<Integer> ansfrombelowcall = findallIndex2(arr,target,index+1);
              list.addAll(ansfrombelowcall);
              return list;
            }
    
}
