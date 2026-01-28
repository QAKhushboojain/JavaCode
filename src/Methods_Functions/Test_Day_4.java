package Methods_Functions;

public class Test_Day_4 {
    static void modify(int[] arr)
    {
     arr [0] = 99;
    }
    public static void main(String[] args) {
        int [] arr = {1,2};
        modify(arr);
        System.out.println(arr[0]);
        // Explanation: reference passed by value; modifies same array object.
    }
}
