package Methods_Functions;

public class Test_Day_15 {
    static void m(int x)
    {
        System.out.println(x);
    }

    public static void main(String[] args) {
        int i = 0;
        m(i++);
        System.out.println(i);
        // Explanation: post-increment passes old value, then increments.
    }
}
