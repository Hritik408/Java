package StackandQueue.CustomStack;
public class circularMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(2);
        queue.insert(4);
        queue.insert(9);
        queue.insert(1);
        
        queue.display();
        System.out.println(queue.remove());
        queue.insert(13);
        queue.display();
    }
    
}
