package Static_Non_Static_Behavior;

public class A5 {
    static int s = 10;
    int i = 20;

    public static void main(String[] args) {
        System.out.println(A5.s);
        A5 a = new A5();
        System.out.println(a.i);
        // Explanation: static variable accessed by class; instance by object.
    }
}
