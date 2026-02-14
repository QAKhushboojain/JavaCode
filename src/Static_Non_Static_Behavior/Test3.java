package Static_Non_Static_Behavior;

import static java.lang.Math.max;
// Static import (calling static method without class name)
public class Test3 {
    public static void main(String[] args) {
        System.out.println(max(3,7));
        // Explanation: static import allows direct call of static method.
    }
}
