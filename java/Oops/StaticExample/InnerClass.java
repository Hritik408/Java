package Oops.StaticExample;
// outer class in not static but inner class can be static
//    class test{  // if these contest mention below public class inner class then it is dependent on innerclass
//     String name;  // it is true if it is mention here
//     public test(String name){
//         this.name= name;
//     }
//   }

public class InnerClass {
    

    static class test{    // this static class not depentend on object of above class but it is related to the below psvm
        String name;

        public test(String name){
            this.name = name;   // this is represent the object
        }  // line 13 to 19 is not depend upon object of the InnerClass because it is static
    }  

    public static void main(String[] args) {   // main and test(13) related to each other
        test a = new test("kunal");
        test b = new test("rahul");

        System.out.println(a.name);  // println is method , out is variable and system is class
        System.out.println(b.name);

    }
}
