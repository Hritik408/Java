package Oops.interfaces.nestedInterface;

public class A {
    // nested interface
    public interface  NestedInterface { // nested inteface can be declaired as public, private, protected
        boolean isOdd(int num);
        
    }
} 

class B implements A.NestedInterface{
    
    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;  // for even 1 is replace with 0 on rhs
    }
}