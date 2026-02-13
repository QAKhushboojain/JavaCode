package Static_Non_Static_Behavior;

public class A2 {
    void n()
    {

    }

    public static void main(String[] args) {
     //   n(); // No Object
    }
    // Calling instance method from static method without object (compile-time error)
 //   Compile-time error: non-static method n() cannot be referenced from a static context
  //   Explanation: static context cannot directly call instance methods.

}
