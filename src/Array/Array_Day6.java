package Array;

public class Array_Day6 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        for(int i = 0; i<=a.length; i++)
        {
            System.out.println(i);
            // It prints the value of i, NOT array value.
            // Explanation: loop prints i, not array access; runs while i <= length (prints 3).
        }
    }
}
