package Methods_Functions;

public class Test_Day_5 {
    static void reassing(int [] arr )
    {
        arr = new int[] {9,9};
    }

    public static void main(String[] args) {
        int [] arr = {1,2};
        reassing(arr);
        System.out.println(args[0]);
        // Explanation: reassigning local param doesn't change caller reference.
    }
}
