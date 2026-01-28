package Methods_Functions;

public class Test_Day_13 {
    static void v(int... nums) { // varargs = int array
        System.out.println(nums.length);
    }


    public static void main(String[] args) {
        v(); // empty array → length = 0
        v(1, 2); // array {1,2} → length = 2
    }
}
