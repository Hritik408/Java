package StackandQueue.CustomStack;

public class customQueue {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;
      int end = 0;
    public customQueue(){
        this(DEFAULT_SIZE);
    }

    public customQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;  // ptr is at last index
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
    //   data[end] = item;
    //    end++;
    data[end++] = item;  // here first insert the item then increase same as line(28 29)
    return true; 
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        // shift the elements to left
        for(int i =1;i<end;i++){  // here end is 5 is element is 5
            data[i-1] = data[i];
        }  
        end--;
        return removed;
    }

   public int front() throws Exception{
    if(isEmpty()){
        throw new Exception("Queue is empty");
    }  
    return data[0];
   }

   public void display(){
    for(int i =0;i<end;i++){
        System.out.print(data[i] + "->");
    }  System.out.println("End");
   }
}  
// if u add item firstly, then u add the item and increases the end
// in stack first we make space for item then incert but in queue we incert item then make space bcz for first item space is present as we creaated
