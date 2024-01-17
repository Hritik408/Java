package Oops.Properties.Polymorphism;

public class Circle extends Shapes {

    // this will run when obj of Circle is created
    // hence it is overriding of parent method
    @Override // this is called annotation
    void area(){
        System.out.println("Area is pie * r *r");
       }
}
