package Oops.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Triangle triangle = new Triangle();
         Shapes cirle = new Circle();
        cirle.area();
        square.area();
        triangle.area();
    }
}
