package Array.AdvancedTricky_Array;

public class Array_Day43 {
    public static void main(String[] args) {
        int a [] = {1,0,2,0,3,0};
        int k = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(a[i] !=0) a[k++] = a[i];
        }
        while (k<a.length) a[k++] = 0;
        System.out.println(java.util.Arrays.toString(a));
        // Explanation: move zeros to end preserving order.
    }

}
