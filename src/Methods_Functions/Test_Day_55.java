package Methods_Functions;

public class Test_Day_55 {
    static int f() {
        try {
            return 1;
        } finally {
            System.out.println("in finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(f());
        // Explanation: finally executes before printing returned value.
    }
}
