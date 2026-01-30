package Methods_Functions;

public class Test_Day_63 {
    static void m(Object o)
    {
        System.out.println("O");
    }
    static void m(String s)
    {
        System.out.println("S");
    }
    static void m(Integer... i)
    {
        System.out.println("V");
    }

    public static void main(String[] args) {
     //   m(null); // prints S (most specific)

    }

}
