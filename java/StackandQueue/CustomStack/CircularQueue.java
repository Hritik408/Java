package StackandQueue.CustomStack;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;  // end may not be data.lenght
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;  // first insert the item then increse the size of end
        end = end % data.length;  // here % helps to come arrording to value of ans as index
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }  

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }  
        return data[front];
    }  

    public void display(){
     if(isEmpty()){
        System.out.println("Empty");
     }  int i = front;
     do{
        System.out.print(data[i] + " -> ");
        i++;
        i %= data.length;  
     }  while(i!=end);
     System.out.println("End");
    }


}
  // the protected keyword in Java is an access modifier that allows access to the member (in this case, the variable end) from within the same class and its subclasses.
  //  It restricts access from outside the class.
  // default (no modifier): The member is accessible only within the same package.
  // private: The member is accessible only within the same class.

  // line 60 if i is less than data.length, i % data.length is simply i, so there is no change.
//  If i is greater than or equal to data.length, i % data.length brings it back to a value within the range of valid indices for the array. For example, if i is equal to data.length, i % data.length would be 0, effectively wrapping i back to the beginning of the array.
 //   So, i %= data.length ensures that i never exceeds the bounds of the array, allowing you to traverse the circular queue correctly by wrapping around to the beginning as needed. This is a critical part of implementing a circular queue data structure.




