package Oops.StaticExample;

public class Main {    // hritik and rohan are the objects for class human
    public static void main(String[] args) {  // static belongs to class not to object
        Human hritik = new Human(21, "hritik chaudhary", 10000, false);  // here hritik and in below line rohan are the objects of class Human
        Human rohan = new Human(31, "rohan chaudhary", 11000, true);
        System.out.println(rohan.population);
    }  
    // this is not dependent on objects
    static void fun(){
        // greeting(); // u cannot use this because it requires an instace but the function u are using it in does not depend on instances ,

        // u cannot access non static stuff without refenencing their instances in a static context

        // hence , here i am refrencing it
        Main obj = new Main();
        obj.greeting();

        // void fun3{   their is an error because it is not static

        // }
    }

    // we know that something which is not static , belongs to an object
    void greeting(){
        System.out.println("hello world");
    }

    void fun2(){

    }
}
