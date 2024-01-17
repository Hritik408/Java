package Oops.Abstract;

public  abstract class parent {

    int age;

    public parent(int age){
        this.age = age;
    }

    static void hello(){  // abstract contains static method
        System.out.println("hey");
    }

    void normal(){
        System.out.println("hey normal");
    }
     abstract void carrer();
     abstract void partner();
 
     // u can not create abstract static constructer
    
}
