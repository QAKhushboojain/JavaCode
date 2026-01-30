package Methods_Functions;

public class Test_Day_66 {
    static int set(int[] arr, int idx, int val)
    {
        arr[idx]=val; return val;
    }
    public static void main(String[] a)
    {
        int[] arr = {0};
        System.out.println(set(arr,0,5));
        System.out.println(arr[0]);
    }
}

