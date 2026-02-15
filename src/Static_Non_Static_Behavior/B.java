package Static_Non_Static_Behavior;

public class B {
    public static void main(String[] args) {
        A18 a = new A18();
     //   a.p();
        // Compile-time error: p() has private access in A
        //Explanation: private instance method inaccessible outside class.
    }
}
