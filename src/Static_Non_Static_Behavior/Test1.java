package Static_Non_Static_Behavior;

public class Test1 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.m();
        // Instance method overriding
        // Explanation: instance methods overridden — runtime type decides (dynamic dispatch).
    }
}
