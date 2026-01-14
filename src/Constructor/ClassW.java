package Constructor;
// Constructor recursion using this() — compile-time error
public class ClassW {
    ClassW()
    {
        this(5);
    }
    ClassW(int x)
    {
    //    this(); // Output
     //   Compile-time error: recursive constructor invocation
      //  Explanation: this() chain cycles — compiler detects recursion.
    }

}
