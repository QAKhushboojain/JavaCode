package Methods_Functions;
// Static initializer vs static method call ordering
public class Test_Day_38 {
    static int x = init();
    static int init()
    {
        System.out.println("init");
        return 5;
    }
    public static void main(String[] a)
    {
        System.out.println(x);
        // Explanation: static init runs at class load before main.
    }

}
