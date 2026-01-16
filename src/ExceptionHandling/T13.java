package ExceptionHandling;

public class T13 {
    static {
        int x = 1/0;
    }

    public static void main(String[] args) {
        System.out.println("Main");
        // Explanation: Exception in static initializer causes ExceptionInInitializerError, class fails to initialize.
    }
}
