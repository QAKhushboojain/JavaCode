package Methods_Functions;

public class Test_Day_67 {
    static void f(Integer i)
    {
        i = i + 1;
        System.out.println(i);
    }
    public static void main(String[] a)
    {
        Integer i = 5;
        f(i);
        System.out.println(i);
    }
}