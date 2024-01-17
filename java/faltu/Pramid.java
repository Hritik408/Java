package faltu;

public class Pramid {
    public static void main(String[] args) {
        int m = 6;
        int n = 6;
        st(m,n);
    }

    static void st(int m, int n) {
        if (m == 0) return;
        st(m - 1 , n);
        space(m,n-m);
        star(2 * m - 1);
        System.out.println();
    }

    static void star(int n) {
        if (n == 0) return;
        System.out.print("*");
        star(n - 1);
    }

    static void space(int n ,int k) {
        if (k == 0) return;
     //   System.out.print(" ");
        space(n,k-1);
        System.out.print(" ");
    }
}


    //        *
    //       ***
    //      *****

   