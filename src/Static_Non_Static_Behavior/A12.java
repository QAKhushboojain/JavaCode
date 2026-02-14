package Static_Non_Static_Behavior;
// Using this in static method (compile-time error)
public class A12 {
    static void m()
    {
       // System.out.println(this);
        // Compile-time error: cannot use 'this' in a static context
        //Explanation: this requires instance context.
    }
}
