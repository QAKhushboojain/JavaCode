package Methods_Functions;

public class Test_Day_3 {
    static void inc (int x)
    {
        x = x + 1;
    }
    public static void main(String[] args) {
        int n = 5;
        inc(n);
        System.out.println(n);
        // Explanation: int passed by value; original not changed.
    }
}
