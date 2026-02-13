package Static_Non_Static_Behavior;

public class Test2 {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        System.out.println(p.x);
        // Explanation: static fields hide not override; reference type (Parent) used.
    }
}
