package Array.Duplicates_Frequency_Array;

public class Array_Day21 {
    public static void main(String[] args) {
        int a [] = {1,2,2,3,3,3};
        int count = 0;
        for(int v : a)
        {
            if(v == 3)
            count++;
        }
        System.out.println(count);
        // Explanation: three occurrences of 3.
    }
}
