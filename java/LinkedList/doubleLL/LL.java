package LinkedList.doubleLL;

public class LL {

    Node head;
    

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;  // here node is that node which we created
        }
        head = node;
    } 

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return ;
        }

        while(last.next!=null){
          last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void display(){
        Node tempNode = head;  // temp is temporary node as the first node
        Node lastNode = null;  
        while(tempNode!=null){
          System.out.print(tempNode.val + " -> ");
          lastNode = tempNode;
          tempNode = tempNode.next;
        } 
         System.out.println("END");

         System.out.println("Print in reverse");
         while(lastNode!=null){
            System.out.print(lastNode.val + " -> ");
            lastNode = lastNode.prev;
         }
         System.out.println("START");
    }






    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) { // constructor
            this.val = val;
        }

        public Node(int val, Node next, Node prev) { // constuctor
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
