package Oops.firstLec;

public class wrapperEx {
    public static void main(String[] args) {
        final A kunal = new A("kunal khushwaha",54);
        kunal.name = "other name";
 //       kunal = new A("new object"); // when a non primitive is final,u cannot reassign it.
          System.out.println(kunal.name);
          System.out.println(kunal.num);
    }  
}
    class A {
      final   int num = 10;
        String name;

        public A(String name,int number){
            this.name = name;
     //        this.num = number;  // A.num cannot be assign
        }
    }

