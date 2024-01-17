package LinkedList.singleLL;

public class Main {
    public static void main(String[] args) {
     LL list = new LL();
     list.insertFirst(3);
     list.insertFirst(2);
     list.insertFirst(30);
     list.insertFirst(7);
     list.insertLast(99);
     list.randomInsert(99, 3);
     list.display();
     System.out.println(list.deleteFirst());
     list.display();
    System.out.println(list.deleteLast());
     list.display();
     System.out.println(list.deleteParticular(2));
     list.display();
     System.out.println(list.find(30));

    }
}
