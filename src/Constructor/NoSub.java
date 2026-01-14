package Constructor;

public class NoSub {
    private NoSub()
    {

    }
   // Class tryExt extends NoSub{ //  // attempt to extend
// Output
//Compile-time error: implicit super constructor NoSub() is not visible; must explicitly invoke another constructor
//Explanation: Subclass cannot access private super constructor; cannot compile unless super has accessible ctor.

    }

