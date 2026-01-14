package Array.Special_Tricky_Index_Array;

public class Array_Day30 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        int i = 0;
        while (i<a.length)
        {
            System.out.println(a[i++]);
            i++;
            // Explanation: in loop i increments twice: prints index 0 then 2.
        }
    }
}
