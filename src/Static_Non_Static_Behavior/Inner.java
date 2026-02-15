package Static_Non_Static_Behavior;

import static Static_Non_Static_Behavior.Outer.s;
// Static nested class and calling outer static/non-static
class Inner {
    void show()
    {
        System.out.println("s=" + s);
         // would be compile error: cannot access instance field
    }

    public static void main(String[] args) {
        new Inner().show();
        // Explanation: static inner can access outer static members but not outer instance members without object.
    }
}

