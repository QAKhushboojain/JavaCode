package Methods_Functions;

public class Test_Day_14 {
    static void v(int a, int... rest) { // ✅ correct varargs
        System.out.println(rest.length);
    }


    public static void main(String[] args) {
        v(5);
// required param provided, rest is empty array
    }
}
