package Oops.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population; // population should be same for object not dependent on object that how it is known as static method or variables

    static void message(){
        System.out.println("hello bete");
 //       System.out.println(this.age);  // u cant use this bcz this is object and u use static 
    }

     public Human(int age, String name, int salary, boolean married){
        this.age = age;   // this represents object refrences
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;  // here human is write instead of this is because population is common for every object of the Human class
     }
}
// we know that something which is not static , belongs to an object
// an object is instances of class