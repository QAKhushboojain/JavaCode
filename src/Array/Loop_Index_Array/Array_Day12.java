package Array.Loop_Index_Array;

public class Array_Day12 {
    public static void main(String[] args) {
        int a [] = {0,1,2,3};
        for(int i = 0; i<a.length; i++)
        {
            if(i%2==0)
                // This checks whether the index i is even.
            System.out.println(a[i]);
            // Explanation: prints elements at even indices.
        }

    }
}
