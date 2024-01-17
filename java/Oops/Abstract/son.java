package Oops.Abstract;

public class son extends parent {
    
    int age;
    son(int age){
        super(age);
    }
    
    @Override
    void carrer() {
        System.out.println("I love You");
        
    }  

    @Override
    void partner() {
        System.out.println("I love" );     
    }   

    @Override   // without line 21 to 24 completely fine
    void normal(){
        super.normal();
    }

    
}
