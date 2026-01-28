package Methods_Functions;

public class Test_Day_16 {
    static void m(int x, int y)
    {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        int i = 0;
        m(++i, i);
        // Explanation: ++i increments before pass
    }
}
