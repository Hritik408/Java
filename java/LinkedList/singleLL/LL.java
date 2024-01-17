package LinkedList.singleLL;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }  
        size+=1;
    }  

    public void randomInsert(int val, int index){  // means between nodes
      if(index == 0){
        insertFirst(val);
        return;
      }
      if(index == size){
        insertLast(val);
        return;
      }
      Node temp = head;  // here index is 0
      for(int i = 1;i<index;i++){
        temp = temp.next;   // here final temp will be 9 if no is 3 5 9 8 and we want insert 7 at index 3
      }
      Node node = new Node(val, temp.next);  // here temp.next will be after node 9 
      temp.next = node;  // here node is that node which we created or inset the value
      size++;
    }

    public int  deleteFirst(){
        int val = head.value;
        head = head.next;   // this remove the first node and head point to the second node
        if(head == null){
            tail = null;
        }
        size --; // here size is reduce by 1 as first node remove
        return val;  // return the value which is reduced
    }

    public Node find(int value){ // find the node which have that value
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            } 
            node= node.next;
        }  
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i =0;i<index;i++){
            node = node.next;
        } 
        return node;  // here u return indexed node
    }  

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);  // here u have second last node 
        int val = tail.value;   // here val contain last node value and it will be return
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteParticular(int index){
      if(index == 0){
       return deleteFirst();
      }  
      if(index == size-1){  // last index of element
        return deleteLast();
      }
      Node prev = get(index-1);  // 2 3 9 5 if u want to remove 9(2) then u should go at 3(1) ,final prev = 3
      int val = prev.next.value;
      prev.next = prev.next.next;  // here prev.next(lhs) will be 5 
     return val;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " ->");
            temp = temp.next;
        }  System.out.println("END");
    }

      private class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value  = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

      }
}
