package Oops.Properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box(2,5,5);   // box1 is an object
        // Box box2  =new Box(box1);
        // System.out.println(box1.l + " " + box1.h + " " + box1.w);
        // System.out.println(box2.l);
        
        boxWeight box3 = new boxWeight();
        System.out.println(box3.h+" "+box3.weight);
        boxWeight box4 = new boxWeight(2, 3, 4, 30);
    //    System.out.println(box4.l+" "+box4.h+" "+box4.w+" "box4.weight);
     
         Box box5 = new boxWeight(2,3,5,8);
        System.out.println(box5.w);
           
  // when the obj itself is of type parent class, how will u call the constructor
   // *    boxWeight box6 = new Box(2,3,4);  //   cant have child variable and parent object
  //      System.out.println(box6);;

    }
}  // downward classes not idea about downward classes but below class idea about above classes
