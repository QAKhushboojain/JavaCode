package Constructor;

public class Constructor_Day6_ClassF {
    // this() must be first statement (compile-time)
    Constructor_Day6_ClassF()
    {}
    Constructor_Day6_ClassF(int x)
    {
        System.out.println("Before");
      //  this(); //   illegal
        // Output
        //Compile-time error: call to this() must be first statement in constructor
        //Explanation: Java enforces this()/super() as first line.
    }
}
