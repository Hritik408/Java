package Oops.Singleton;
public class Singleton {
    // Private static variable to hold the single instance of the class.
    private static Singleton instance;  // instance means obj of the class

    // Private constructor to prevent direct instantiation.
    private Singleton() {
        // Initialization code here, if needed.
    }

    // Public static method to provide access to the single instance.
    public static Singleton getInstance() {
        // Check if the instance has not been created yet.
        if (instance == null) {
            // Create a new instance if it doesn't exist.
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and fields can be added as needed.
}

