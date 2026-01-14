package Array.Sum_Aggregates_forEach_Array;

public class Array_Day15 {
    public static void main(String[] args) {
        int a [] = {2,4,6};
        int product = 1;
        for(int i =0; i<a.length; i++)
        {
            product*= a[i];
        }
        System.out.println(product);
        // 1 × 2 × 4 × 6 = 48
    }
}
