package Oops.generics;

import java.util.Arrays;

// here T should either be Number or its subclasses
public class WildcardExample <T extends Number> {
    private Object[] data;  // u can not directly change
    private static int DEFAULT_SIZE = 10; // it is static bcz it is not dependent on object
    private int size = 0;  // also working as index value

    public WildcardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
        data[size++] = num;  // firsty insert element then increase
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];  // make a new array which have double the size of previous one
        // copy the element of current array into new array
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;  // now our data is equal to new temp data
    }

    private boolean isfull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);  // here in smaller type of u try to add bigger type so casting is required
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T value){
        data[index] = value; // here in bigger one u add smaller one so casting is not required
    }
  
        @Override
    public String toString(){
        return "customArraylist{" +
        "data=" + Arrays.toString(data) +
        ", size=" + size +
        '}';

        }
    

    public static void main(String[] args) {
      //  customArraylist list = new customArraylist();
        // list.add(13);
        // list.add(15);
        // list.add(17);
        // for (int i = 0; i < 14; i++) {
        //     list.add(2*i);
        // }

        // System.out.println(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(5269)

    customGenarraylist<Integer> list3 = new customGenarraylist<>();

     for (int i = 0; i < 14; i++) {
            list3.add(2*i);
        }
        System.out.println(list3);
    }
}
