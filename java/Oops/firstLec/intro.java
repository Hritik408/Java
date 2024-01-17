package Oops.firstLec;

public class intro {
    public static void main(String[] args) {  // if u not use static in this line then u might be created the object of particular thing and if u not use main then program does'not run

        // int[] rno = new int[5];
        // String[] name = new String[5];
        // float[] marks = new float[5];

        // Student[] students = new Student[5];

        // Student kunala = new Student();
        Student kunal = new Student(222, "rohan sharma", 66.3f);

        kunal.rno = 12;
        kunal.name = "kunal kushwaha";
        kunal.marks = 88.4f;
        // kunal.salary = 25; can not use salary bcz it is not mention in class
        // student..

        // kunal.changeName("jaat");
        // kunal.greeting();

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        // kunal.changeName("jaat");
        // kunal.greeting();

        // System.out.println();

        // System.out.println(kunal.rno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);

        System.out.println();

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Something something";
        System.out.println(two.name);

    }
    // class Student {
    // int rno;
    // String name;
    // float marks = 90;
    // }
}

// creat a class for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    void greeting() {
        System.out.println("hello! my name is " + this.name);
    }

    Student(Student other) { // random
        this.name = other.name; // other is replace with kunal and this is replace with random
        this.rno = other.rno;   // this is replace with name of refrence variable
        this.marks = other.marks;
    }

    // Student(){ // it's an constructor..
    // this.rno = 12;
    // this.name = "hritik";
    // this.marks = 99.9f; // this is pointing to the refrence variable(kunal)
    // }

    void changeName(String newName) {
        name = newName;
    }

    Student() {
        // this is how u call a constructor from another constructor
        // internally : new Student(13,"default person",100.0f);
        this(13, "default person", 100.0f);
    }

    // Student arpit = new Student(17,"Arpit",8;9.7f);
    // here , this will be replace with arpit.
    Student(int rollno, String name, float marks) {
        rno = rollno; // if u not use this then u should modified the refrence variable
        this.name = name;
        this.marks = marks;
    }
}
