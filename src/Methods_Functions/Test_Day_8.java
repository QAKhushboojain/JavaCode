package Methods_Functions;

public class Test_Day_8 {
    static void m(Integer i)
    {
        System.out.println("Integer");
    }
    static void m(int i)
    {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        m(5);
        // Explanation: exact boxing to Integer preferred over varargs.
    }
}
