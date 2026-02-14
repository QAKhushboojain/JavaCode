package Static_Non_Static_Behavior;

public class Test4 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        p.m(5);
        // Explanation: m(int) resolved by reference type Parent. Static methods are hidden and overloaded here.
    }
}
