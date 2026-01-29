package Methods_Functions;

public class B6 extends A6{
    static void m(A6 a)
    {
        System.out.println("A");
    }
    static void m(B6 b)
    {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A6 x = new B6();
        m(x);
        // Explanation: overloaded method chosen by compile-time type (A), not runtime type.
    }

}
