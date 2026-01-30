package Methods_Functions;

public class Test_Day_64 {
    static int cache = -1;
    static int expensive()
    {
        if(cache!=-1) return cache;
        cache=42; return cache;
    }
    public static void main(String[] a)
    {
        System.out.println(expensive());
        System.out.println(expensive());
    }
}

