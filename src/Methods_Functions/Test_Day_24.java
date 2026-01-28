package Methods_Functions;

public class Test_Day_24 {
    static int [] get(){
        return new int [] {1,2};
    }

    public static void main(String[] args) {
        int [] r = get();
        r[0] = 9;
        int [] r2 = get();
        System.out.println(r2[0]);
        // Explanation: get() returns a new array each call.
    }

}
