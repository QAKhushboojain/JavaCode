package Methods_Functions;

public class Test_Day_62 {
    static void p(int x)
    {
        System.out.println(x);
    }

    public static void main(String[] args) {
        int i = 0;
        p(i++);
        p(i++);
        p(++i);
        // Explanation: step through increments.
    }
}
