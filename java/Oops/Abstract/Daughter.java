package Oops.Abstract;

public class Daughter extends parent {
    @Override
    void carrer(){
        System.out.println("I love coding");
    }

    @Override
    void partner() {
        System.out.println("I love" );     
    } 

    int age;
    Daughter(int age){
        super(age);
    }
}
