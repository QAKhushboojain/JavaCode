package Methods_Functions;

public class Test_Day_69 {
    static void f(int x)
    {
        x += 5;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        f(x);
        System.out.println(x);
        // -2147483648 ? No — output for f(x) prints overflowed value but original unchanged
        //Actual Output
        //-2147483648
        //2147483647
        //Explanation: arithmetic overflow in method; original variable unchanged.
    }
}

