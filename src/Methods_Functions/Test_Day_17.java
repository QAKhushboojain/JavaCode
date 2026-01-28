package Methods_Functions;

public class Test_Day_17 {
    static int f(int x)
    {
        System.out.println("f" + x);
        return x;
    }
    static void g(int a, int b)
    {
        System.out.println("g:"+a+","+b);
    }

    public static void main(String[] args) {
        g(f(1), f(2));
        // Explanation: left-to-right arg evaluation
    }
}
