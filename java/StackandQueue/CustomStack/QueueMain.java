package StackandQueue.CustomStack;

public class QueueMain {
    public static void main(String[] args) throws Exception {
      customQueue queue = new customQueue(5);
      queue.insert(5);
      queue.insert(2);
      queue.insert(4);
      queue.insert(9);
      queue.insert(1);

      queue.display();

      System.out.println(queue.remove());  // in remove it take O(n) bcz it shift items in left 

      queue.display();

      System.out.println(queue.front());


    }
}
