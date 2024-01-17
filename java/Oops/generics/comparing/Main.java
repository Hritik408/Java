package Oops.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

import Recursion.permutations;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 88.26f);
        Student rahul = new Student(10, 91.36f);
         Student mohan = new Student(9, 80.26f);
        Student karan = new Student(6, 97.36f);
         Student hritik = new Student(7, 89.26f);

         Student[] list = {kunal, rahul, mohan, karan, hritik};

         System.out.println(Arrays.toString(list));
         Arrays.sort(list,new Comparator<Student>()){
         @Override
         public int compare(Student o1, Student o2)
         }
        

        if(kunal.compareTo(rahul) < 0){
            System.out.println(kunal.compareTo(rahul));
            System.out.println("rahul has more marks");
        }
    }
}
