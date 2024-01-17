package Oops.Properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
    double side;

    Box() {   // normal constructor

        // super() obj class

    this.l = -1;
    this.h = -1;
    this.w = -1;
    }  

    // cube 
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }   

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
