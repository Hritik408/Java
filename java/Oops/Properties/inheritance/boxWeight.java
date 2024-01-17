package Oops.Properties.inheritance;

public class boxWeight extends Box{    // extends Box means all the properties of Box , boxWeight can acces
    double weight;
    boxWeight(){
        this.weight = -2;
    }  
    boxWeight(boxWeight other){
        super(other);
          weight =  other.weight;
    }

     boxWeight(double side, double weight) {
        super(side);
        this.weight  = weight;
    }


    public boxWeight(double l, double h, double w, double weight){
        super(l,h,w);  // call the parent class constructor and used to initialise values present in parent class
        this.weight = weight;  // super means directly above case
    //    super(l,h,w);  u can not write in this line bcz super class not care about base(child) class(items)
    // but child class care what's parent class contain

      
    }
}
