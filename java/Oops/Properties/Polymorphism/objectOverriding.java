package Oops.Properties.Polymorphism;
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

public class objectOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dogAsAnimal = new Dog(); // Polymorphism: A Dog treated as an Animal

        animal.makeSound(); // Outputs: The animal makes a sound
        dogAsAnimal.makeSound(); // Outputs: The dog barks
    }
}   
