package Constructor;
// Constructor with repeated call to super (compile error)
public class C2 extends C1{
    C2()
    {
      //  Super();
        super(); // illegal duplicate
// Output
//Compile-time error: call to super must be first statement and cannot be duplicated
//Explanation: Only one super() accepted and must be first.
    }
}
