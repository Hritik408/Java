package BinarySearch;
public class EvendigitsLeetcode {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896,202032};
        int ans = findnums(nums);
     //   int count =0;
        System.out.println(ans);
    }  
      static int findnums(int[] nums){
        int count =0;
        for(int num:nums){
           if(even(num))
           count++;}
           return count ;
    }    
     static boolean even( int num){
        int noOfdigits = digit(num);
         return noOfdigits%2==0;
        
    }    static int digit(int numb){
      int count = 0 ;
        if(numb<0)  return numb*-1;
      if(numb==0)    return 1;
        while(numb!=0){
            count ++;
            numb/=10;
        }    return count;
    }
}
