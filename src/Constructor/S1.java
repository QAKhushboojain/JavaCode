package Constructor;

public class S1 {
    int x = printlnit("S1.field");
    static int printlnit(String s)
    {
        System.out.println(s);
        return 0;
    }
    S1()
    {
        System.out.println("S1.constructor");
    }
}
