package Static_Non_Static_Behavior;

public class A7 {
    int i = 5;
    static void m()
    {
    //    System.out.println(i);
    }

    public static void main(String[] args) {
        // Output
        //Compile-time error: non-static variable i cannot be referenced from a static context
        //Explanation: need an object to access instance variable inside static method.
    }
}
