package Oops.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int Rollno, float marks){
        this.rollno = Rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o){
        int diff = (int)(this.marks - o.marks);  // this.marks is of kunal and o.marks is of rahul

        // if diff == 0: means both are equal
        // if diff < 0 : means o is bigger else o is smaller

        return diff;
    }
}
