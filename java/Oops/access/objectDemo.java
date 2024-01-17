package Oops.access;


public class objectDemo {

    int num;
    float gpa;

    public objectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    @Override
    public int hashCode(){   // hashcode give the number representation of an object
        return super.hashCode();
    }
    
    @Override
    public boolean equals(Object obj){
     //   return super.equals(obj);
     return this.num == ((objectDemo)obj).num;  // this is for obj1.equals(obj2)
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }  

    public static void main(String[] args) {
        objectDemo obj1 = new objectDemo(34,23f);
        objectDemo obj2 = new objectDemo(78, 90f);
    //    System.out.println(obj.hashCode());
    //    System.out.println(obj2.hashCode());

    if(obj1 == obj2){  // this is just check the adresses basically
        System.out.println("obj1 is equals to obj2");
    }
    if(obj1.equals(obj2)){
        System.out.println("obj1 is equals to obj2");  // this is just checking the value is same or not
    }

    System.out.println(obj1.getClass().getName());
    }
}
