package Array.Loop_Index_Array;

public class Array_Remember1 {
    public static void main(String[] args) {
        int a [] = {0,1,2,3};
        for(int i = 0; i<a.length; i++)
        {
            // If you wanted even values, condition should be:
            if(a[i] % 2 == 0)
            System.out.println(a[i]);
        }
    }
}
