package Constructor;

public class ClassS extends ClassR {

  //  ClassS()
    {}

    ClassS(int x) {
        super(x);
    }

    public static void main(String[] args) {
     //   new ClassS();
        // Output
        //Compile-time error: constructor R in class R cannot be applied to given types; required: int; found: no arguments
        //Explanation: If parent has only parametrized ctor, child must call it explicitly.
    }
}