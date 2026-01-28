package Methods_Functions;

public class Test_Day_19 {
    static void r()
    {
        r();
    }

    public static void main(String[] args) {
        r();
        // Exception in thread "main" java.lang.StackOverflowError
        // Explanation: infinite recursion overflows stack.
    }
}
